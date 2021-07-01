package pilates;

import java.util.Scanner;

public class PilatesApp {

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main

	public static void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {// null이 아닌경우만 화면에 출력하시오 라는 뜻
				System.out.println(members[i].showInfo());
			}
		}
	}

	public static void memberAdd() {
		System.out.print("이름 입력 >>> ");
		String name = scn.nextLine();
		System.out.print("연락처 입력 >>> ");
		String phone = scn.nextLine();
		System.out.print("생일 입력 >>> ");
		String birth = scn.nextLine();
		System.out.print("성별 입력(1:남, 2:여 )>>> ");
		int gen = scn.nextInt();
		Gender gender = null;
		System.out.println("입력 완료 되었습니다.");

		if (gen == 1) {
			gender = Gender.MEN;
		} else if (gen == 2) {
			gender = Gender.WOMEN;
		}

		Member member = new Member();
		member.setMemberName(name);
		member.setMemberPhone(phone);
		member.setMemberBirth(birth);
		member.setMemberGen(gender);
		member.setMemberId(getNextId());

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력 시 비워져 있는 곳에 입력.
				members[i] = member;
				break; // 비워있는 위치에 한건 입력 후 종료.
			}
		}

	}

	public static int getNextId() {
		// 회원번호 가입순번 =>1,2,3,4, .....
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {// 현재 멤버아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();

				}
			}
		}
		memberId++;
		return memberId;
	}

	public static void showMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println(" 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 9.종료 ");
		System.out.println("--------------------------------------------------");
		System.out.print("선택 >>> ");

	}
}
