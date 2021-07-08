package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

// 화면에 정보보여주고 사용자의 입력에 따라 처리해줘야 함.
public class FriendCliApp {
	FriendAccess service = new FriendList();

	public void start() {
		// 1.입력 2.수정 3.삭제 4.리스트 5.이름조회 6.전화번호조회 9.종료
		int menu = 0;
		do {
			menuTitle();
			menu = ScannerUtil.readInt("선택 >> ");

			switch (menu) {
			case 1: // 입력
				insert();
				break;
			case 2: // 수정
				update();
				break;
			case 3: // 삭제
				delete();
				break;
			case 4: // 리스트
				list();
				break;
			case 5: // 이름조회
				searchName();
				break;
			case 6: // 전화번호조회
				searchTel();
				break;

			}
		} while (menu != 9);
		{
			System.out.println("프로그램을 종료합니다.");
		}
	}

	public void searchTel() {
		String tel = ScannerUtil.readString("조회할 전화번호입력 > ");
		Friend frt = service.findTel(tel);
		if (frt == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(frt);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

	public void searchName() {
		String name = ScannerUtil.readString("조회할 이름입력 > ");
		Friend fr = service.selectOne(name);
		if (fr == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(fr);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

	public void list() {
		List<Friend> friendList = service.selectAll();
		for (Friend friend : friendList) {
			if (friend != null) {
				System.out.println(friend.toString());
			}
		}

	}

	public void delete() {
		String name = ScannerUtil.readString("삭제할 이름입력 > ");
		service.delete(name);

	}

	public void update() {
//    이름입력 > 
//	  연락처입력 >
		String name = ScannerUtil.readString("이름입력 > ");
		String tel = ScannerUtil.readString("연락처입력 > ");
		Friend friend = new Friend("", name, tel);
		service.update(friend);
	}

	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend);
	}

	public void menuTitle() {
		System.out.println("======친구 관리======");
		System.out.println("||   1. 친구추가   ||");
		System.out.println("||   2. 친구수정   ||");
		System.out.println("||   3. 친구삭제   ||");
		System.out.println("||   4. 전체조회   ||");
		System.out.println("||   5. 이름조회   ||");
		System.out.println("||   6. 전화조회   ||");
		System.out.println("||   9. 종료      ||");
	}

}
