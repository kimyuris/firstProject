package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
//	간단한 예금출금 프로그램.
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택 > ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리.");
				System.out.println("금액을 입력하세요 >>");
				int temp = scn.nextInt();
				balance = balance + temp;
				if (balance >= 100000) {
					System.out.println("100,000원 이상 입금할 수 없습니다.");
				} else {

					System.out.println(balance + "원 입금되었습니다.");
				}

			} else if (menu == 2) {
				System.out.println("출금처리.");
				System.out.println("금액을 입력하세요 >>");
				int temp = scn.nextInt();

			
				if (balance < temp) {
					System.out.println("잔액이 부족합니다. 현재잔액  : " + balance);
				} else {
					balance = balance - temp;
					System.out.println(balance + "원 출금되었습니다.");
					System.out.println("현재잔액 : " + balance);

				}
			} else if (menu == 3) {
				System.out.println("잔액조회.");
				System.out.println("현재 잔액 : " + balance);

			} else if (menu == 4) {
				break;
			} // if 끝

		} // while 끝
		System.out.println("프로그램을 종료합니다. 감사합니다. ");
	}// main 끝
}// class끝
