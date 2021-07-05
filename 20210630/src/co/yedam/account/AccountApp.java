package co.yedam.account;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//데이터를 담아놓기위한 Account
//입금, 출금 => 사용자의 입력으로 컨트롤하고 메뉴를 실행. 
public class AccountApp {
	static AccountApp app = new AccountApp();

	private AccountApp() {

	}

	public static AccountApp getInstance() {
		return app;
	}

	Account[] accounts = new Account[10];// 배열만드는것=필드
	Scanner scn = new Scanner(System.in);// 배열만드는것=필드
	File file = new File("accountList.txt");

	private void printMenu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.파일저장  6.파일열기  7.종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택 >> ");

	}

	private void fileOpen() {// input(파일열기)
		Reader is = null;
		try {
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer();
			while ((readByte = is.read()) != -1) {
				sb.append((char) readByte);
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accounts[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void fileSave() {// output (파일저장)
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void createAccount() {// 계좌생성(메소드)
		String ano = Utils.scanString("계좌번호를 입력하세요 >> ");

		System.out.println("예금주를 입력하세요 >> ");
		String owner = scn.nextLine();
		System.out.println("금액을 입력하세요 >> ");
		String amount = scn.nextLine();
		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount));// 문자열숫자 ->int 숫자로 바꿔줌

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("1건 입력되었습니다.");
				break;// 비어있는 위치에 한건 입력 후 종료.
			}
		}

	}

	private void accountList() {// (메소드)
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\naccount정보 => "
						+ "계좌번호 :" + accounts[i].getAno() + ", 예금주 :" + accounts[i].getOwner() + ", 계좌잔액 :"
						+ accounts[i].getBalance() + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			}
		}
	}// accountList{}

	// 계좌번호(ano)를 입력하여 해당계좌를 반환해주는 메소드.
	private Account findAccount(String ano) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}
		return null;
	}

	private void deposit() {// 예금처리(메소드)
		System.out.println("계좌번호를 입력하세요 >> ");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당계좌가 없습니다.");
		} else {
//			System.out.println("예금할 금액을 입력하세요 >>");
			String amt = Utils.scanNumberString("예금할 금액을 입력하세요 >> ");
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
			int balance2 = (balance + Integer.parseInt(amt));
			System.out.println(Integer.parseInt(amt) + "입금되었습니다.");
			System.out.println("계좌 총 금액은 " + balance2 + "입니다.");
		}

	}// deposit()

	private void withdraw() {// 출금처리(메소드)
		System.out.println("계좌번호를 입력하세요 >> ");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);

		if (acnt == null) {
			System.out.println("해당계좌가 없습니다. 다시입력하세요.");
		} else {
			int balance = acnt.getBalance();
			System.out.println("현재잔액은 " + balance + "입니다.");
			System.out.println("출금할 금액을 입력하세요 >>");
			String amt = scn.nextLine();
		while (true) {
			try {
				if (balance <Integer.parseInt(amt)) {
					System.out.println("잔액이 부족합니다. 다시입력하세요.");
					continue;
				} else {
					acnt.setBalance(balance - Integer.parseInt(amt));
					int balance2 = (balance - Integer.parseInt(amt));
					System.out.println(Integer.parseInt(amt) + "출금되었습니다.");
					System.out.println("계좌 총 금액은 " + balance2 + "입니다.");
				} 
				//	}return ;
	}
	
	}}

	public void exe() {// (메소드)
		// 1.계좌생성. 2.계좌목록 3.예금 4.출금 5.종료
		boolean run = true;
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("계좌생성");
				createAccount();
			} else if (selectNo == 2) {
				System.out.println("계좌목록");
				accountList();
			} else if (selectNo == 3) {
				System.out.println("예금");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("출금");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("파일저장");
				fileSave();
			} else if (selectNo == 6) {
				System.out.println("파일 불러오기");
				fileOpen();
			} else if (selectNo == 7) {
				System.out.println("종료");
				run = false;
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}
}
