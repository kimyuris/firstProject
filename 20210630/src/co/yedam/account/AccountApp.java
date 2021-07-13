package co.yedam.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//데이터를 담아놓은 Account
//컨트롤 입금, 출금 => 사용자의 입력으로 메뉴 실행
public class AccountApp {

	private static AccountApp app = new AccountApp();

	private AccountApp() {
	}

	public static AccountApp getInstance() {
		return app;
	}

	Account[] accounts = new Account[10];
	Scanner scn = new Scanner(System.in);
	File file = new File("accountList.txt");

	private void printMenu() {
		System.out.println("-------------------------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.파일저장|6.파일열기|7.종료");
		System.out.println("-------------------------------------------------");
		System.out.println("선택>>>");
	}

	private void craeteAccount() {

		String ano = Utils.scanString("계좌번호: ");

		System.out.print("예금주: ");
		String owner = scn.nextLine();
		System.out.print("금액: ");
		String amount = scn.nextLine();

		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount));//Integer.parseInt()문자열숫자 -> int 숫자로 바꿈.

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("한건 입력되었습니다.");
				break;// 비어있는 위치에 한건 입력후 종료.
			}
		}
	}// end of craeteAccount()

	private void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("account 정보: " + accounts[i].getAno() + ", " + accounts[i].getOwner() + ", "
						+ accounts[i].getBalance());
			}
		}
	}// end of accountList()

	// 계좌번호(ano) 정보를 입력하면 계좌를 반환해주는 메소드.
	private Account findAccount(String ano) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}
		return null;
	}

	private void fileSave() {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());// ","양쪽에 공란넣지말기(숫자로 변환시 오류남)
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

	}// 파일 저장

	private void fileOpen() {
		Reader is = null;
		try {
			// is = new FileInputStream(file);
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer(); // str += newStr;
			while ((readByte = is.read()) != -1) {
				System.out.println((char) readByte);
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
	}// 파일열기

	private void deposit() {
		System.out.println("계좌번호 입력>>");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌가 없습니다.");
		} else {
			System.out.print("예금액: ");
			String amt = scn.nextLine();
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
			System.out.println(amt+"원이 입금되었습니다.");
		}
	}// 예금

	private void withdraw() {
		@SuppressWarnings("unused")
		boolean run = true;
		System.out.print("계좌번호: ");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);

		if (acnt == null) {
			System.out.println("해당 계좌가 없습니다.");
		} else {
			System.out.println("출금액: ");
			String val = scn.nextLine();
			if (Integer.parseInt(val) > acnt.getBalance()) {
				System.out.println("출금액이 부족합니다.");
				run = false;

			} else {
				int balance = acnt.getBalance();
				acnt.setBalance(balance - Integer.parseInt(val));
				System.out.println(val+"원이 출금되었습니다.");

			}

		}
	}// 출금

	public void exe() {

		boolean run = true;
		// 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("-----");
				System.out.println("계좌생성");
				System.out.println("-----");
				craeteAccount();
			} else if (selectNo == 2) {
				System.out.println("-----");
				System.out.println("계좌목록");
				System.out.println("-----");
				accountList();
			} else if (selectNo == 3) {
				System.out.println("-----");
				System.out.println("예금");
				System.out.println("-----");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("-----");
				System.out.println("출금");
				System.out.println("-----");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("-----");
				System.out.println("파일 저장");
				System.out.println("-----");
				fileSave();
			} else if (selectNo == 6) {
				System.out.println("-----");
				System.out.println("파일열기");
				System.out.println("-----");
				fileOpen();
			} else if (selectNo == 7) {
				System.out.println("-----");
				System.out.println("종료");
				System.out.println("-----");
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of main
}
