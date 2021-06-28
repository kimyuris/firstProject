package conditions;

import java.util.Scanner;

public class Exercise08 {
// 필드..
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		}
		return false;
	}

	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("-----------------------");
		System.out.println("선택 > ");
	}

	public static void deposit() {

		System.out.println("금액을 입력하세요 >>");
		int temp = scn.nextInt();
		//balance = balance + temp;
		balance = add(balance, temp);
		if (balance >= 100000) {

			System.out.println("100,000원 이상 입금할 수 없습니다.");
		} else if (balance < 10000) {

			System.out.println(balance + "원 입금되었습니다.");
		}

	}

	public static void withdraw() {
		System.out.println("금액을 입력하세요 >>");
		int temp = scn.nextInt();

		if (balance < temp) {
			System.out.println("잔액이 부족합니다. 현재잔액  : " + balance);
		} else {
			//balance = balance - temp;
			balance = add(balance, - temp);
			System.out.println(balance + "원 출금되었습니다.");
			System.out.println("현재잔액 : " + balance);

		}
	}

	public static int add(int blance, int amount) {
		int sum = balance + amount;
		return sum;
	}

	public static void main(String[] args) {
//	간단한 예금출금 프로그램.

		boolean run = false;
		do {
			if (!run) { // run값의 부정값이 참일 떄 실행하라는 뜻(현재 run = false)

//			 id와 password 묻고 아이디 admin 패스워드 1234 잘못입력시 종료.
				System.out.println("ID를 입력하세요 >> ");
				String id = scn.nextLine(); // nextLine = 문자입력. nextln = 다음줄에 입력
				System.out.println("PASSWD를 입력하세요 >> ");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);

			} else {
// 메뉴출력.
				printMenu(); // 메소드 호출

				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("예금처리.");
					deposit();

				} else if (menu == 2) {
					System.out.println("출금처리.");
					withdraw();

				} else if (menu == 3) {
					System.out.println("잔액조회.");
					System.out.println("현재 잔액 : " + balance);

				} else if (menu == 4) {
					run = false;
				} // if 끝
			}
		} while (run);// while 끝
		System.out.println("프로그램을 종료합니다. 감사합니다. ");
	}// main 끝
}// class끝
