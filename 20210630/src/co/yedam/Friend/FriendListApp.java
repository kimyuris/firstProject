package co.yedam.Friend;

import java.util.Scanner;

public class FriendListApp {

	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.추가 2.리스트 3.종료
		boolean run = true;
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.추가  2.리스트  3.종료");
			System.out.println("---------------------");
			System.out.println("선택 >> ");
			String selectNo = scn.next();
			Friend friend = null;

			switch (selectNo) {

			case "1":

				System.out.println("1.친구 2.학교친구 3.회사친구");
				String menu = scn.next();

				System.out.println("이름 >> ");
				String name = scn.next();
				System.out.println("연락처 >> ");
				String phone = scn.next();

				if (menu.equals("1")) {
					friend = new Friend(name, phone);
				} else if (menu.equals("2")) {
					System.out.println("전공 >> ");
					String major = scn.next();
					friend = new UnivFriend(name, phone, major);
				} else if (menu.equals("3")) {
					System.out.println("부서 >> ");
					String department = scn.next();
					friend = new CompFriend(name, phone, department);
				}
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				break;

			case "2":
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}
				break;

			case "3":
				run = false;

			}

		}

		System.out.println("종료합니다.");
	}
}
