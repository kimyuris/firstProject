package co.friend.view;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

//화면에 정보보여주고 사용자에 따라 처리해줌

public class FriendCliApp {
	
	FriendAccess service = new FriendList();
	
	// 1입력 2수정 3삭제 4리스트 5이름조회 6전화번호조회 9종료
	public void start() {
		int menu = 0;
		do{
			menuTitle();
			menu = ScannerUtil.readInt("선택> ");
			switch(menu) {
			case 1://입력
				insert();break;
			case 2://수정
				update();break;
			case 3://삭제
				delete();break;
			case 4://리스트
				list();break;
			case 5://이름조회
				searchName();break;
			case 6://전호번호조회
				searchTel();break;
			}
			
		}while(menu !=9);
	}

	
	public void searchTel() {
		
	}
	
	public void searchName() {
		
	}
	
	public void list() {
		
	}
	
	public void delete() {
		
	}
	
	public void update() {
		
	}
	
	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend);
	}
	
	public void menuTitle() {
		System.out.println("=======친구관리=======");
		System.out.println("|     1. 친구추가    |");
		System.out.println("|     2. 친구수정    |");
		System.out.println("|     3. 친구삭제    |");
		System.out.println("|     4. 전체조회    |");
		System.out.println("|     5. 이름조회    |");
		System.out.println("|     6. 전화조회    |");
		System.out.println("|     9. 종료하기    |");
		System.out.println("=========★=========");


	}
	
	
	
	
	
}