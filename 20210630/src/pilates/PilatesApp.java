package pilates;

import java.util.Scanner;

public class PilatesApp {
	private static PilatesApp singleton = new PilatesApp();

	private PilatesApp() {
	}

	public static PilatesApp getInstance() {
		return singleton;
	}

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public void main(String[] args) {
		members = new Member[] //
		{ new Member(1, "Hong", "010-2345-6789", "970101", Gender.MEN),
				new Member(2, "Hwong", "010-1345-6789", "950501", Gender.MEN),
				new Member(3, "Kim", "010-9874-3214", "870301", Gender.MEN),
				new Member(4, "Hong", "010-2345-6789", "970101", Gender.WOMEN) };
		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6. 상세조회 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberUpdate();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 6) {
				searchByDetail();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main

	public void searchByDetail() {
		String name = scanString("조회할 이름을 입력하세요 >>> ");
		boolean exist = false; // 회원정보가 있는지 체크.
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showDetail());

				exist = true;
			}
		}
		if (!exist) {
			System.out.println("해당하는 이름이 없습니다.");
		}

	}

	public void memberUpdate() {
		int id = scanInt("수정할 회원 번호를 입력하세요 >>> ");
		scn.nextLine();
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == (id)) {
				System.out.println(members[i].showInfo());
				exist = true;
				String name = scanString("이름 입력 >>> ");
				String phone = scanString("연락처 입력 >>> ");
				String birth = scanString("생일 입력 >>> ");
				if (!name.equals("")) {
					members[i].setMemberName(name);
				}
				if (!phone.equals("")) {
					members[i].setMemberPhone(phone);
				}
				if (!birth.equals("")) {
					members[i].setMemberBirth(birth);
				}

			}
			if (!exist) {
				System.out.println("해당하는 정보가 없습니다.");
			}
		}
	}

	public void memberDelete() {
		int delId = scanInt("삭제할 회원번호를 입력하세요 >>> ");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == delId) {
				members[i] = null;
				System.out.println("1건 삭제되었습니다.");
				break;
			}
		}
	}

	public void searchByName() {
		String name = scanString("조회할 이름을 입력하세요 >>> ");
		boolean exist = false; // 회원정보가 있는지 체크.
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("해당하는 이름이 없습니다.");
		}
	}

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {// null이 아닌경우만 화면에 출력하시오 라는 뜻
				System.out.println(members[i].showInfo());
			}
		}
	}

	public void memberAdd() {
		String name = scanString("이름 입력 >>> ");
		String phone = scanString("연락처 입력 >>> ");
		String birth = scanString("생일 입력 >>> ");
		Gender gender = scanGen("성별 입력(1:남, 2:여 )>>> ");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력 시 비워져 있는 곳에 입력.
				members[i] = member;
				break; // 비워있는 위치에 한건 입력 후 종료.
			}
		}

	}// add

	public String scanString(String arg) {// (arg => 매개변수) 입력메세지 출력후 문자입력값 반환
		System.out.print(arg);
		String val = scn.nextLine();

		return val;
	}

	public int scanInt(String arg) {// (arg => 매개변수) 입력메세지 출력후 숫자입력값 반환
		int val = 0;
		while (true) {
			try {
				System.out.print(arg);
				val = scn.nextInt();
				break;// 반복문 빠져나오도록함
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
				scn.nextLine();
			}
		}
		return val;
	}

	public Gender scanGen(String arg) {// 입력메세지 출력 후 Gender 반환
		Gender gender = null;
		while (true) {
			try {
				System.out.print(arg);
				int gen = scn.nextInt();// 예외가 발생하면(에러) 에러메세지 출력 후 다시 입력부분으로 돌아옴.(continue)
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2를 입력하세요.");
					continue;// 반복문 탈출 못하도록함
				}
				System.out.println("입력 완료 되었습니다.");
				break;// 반복문 빠져나오도록함
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;
	}

	public int getNextId() {
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

	public void showMenu() {
		System.out.println("------------------------------------------------------------");
		System.out.println(" 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료 ");
		System.out.println("------------------------------------------------------------");
		System.out.print("선택 >>> ");

	}
}
