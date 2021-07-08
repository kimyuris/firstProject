package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.friend.model.Friend;

// FriendAccess(인터페이스)구현하는 객체.
// 파일에 저장.
public class FriendList implements FriendAccess {

	String path = "c:/tmp/friendList.txt";
	List<Friend> friends;

	public void open() {
		File file = new File(path);

		if (!file.exists()) { // path에 해당 파일이 없으면 디렉토리/파일 생성.
			File dir = new File("c:/tmp/");
			dir.mkdirs(); // c:/tmp 디렉토리 생성.
			try {
				file.createNewFile(); // 파일생성 메소드
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Scanner scn = new Scanner(file);
			while (true) {
				if (!scn.hasNext()) {
					break;
				}
				String readStr = scn.next();
				String[] arr = readStr.split(",");

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

				// 배열의 빈 공간에 한건씩 저장하겠다는 의미.
//				for (int i = 0; i < friends.size(); i++) {
//					if (friends[i] == null) {
//						friends[i] = friend;
//						break;
//					}
//				} 대신에 ↓한줄로 표시
				friends.add(friend);
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path));
			for (int i = 0; i < friends.size(); i++) {
//				if (friends[i] != null) { ↑ size가 갯수만큼이기때문에 비어있는걸 확인할 필요가 없음.
				br.write(String.format("%s,%s,%s\n", friends.get(i).getGubun(), friends.get(i).getName(),
						friends.get(i).getTel()));
//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}

	@Override
	public void insert(Friend friend) {
//		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] == null) {
//				friends[i] = friend;
//				break;
//			}
		friends.add(friend);
	}

	@Override
	public void update(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {// 배열에 요소중에서 값이 있는 요소만 가져와서
			if (friends.get(i).getName().equals(friends.get(i).getName())) {// 이름끼리 비교.
				friends.get(i).setTel(friends.get(i).getTel());
				break;
			}
		}
		save();
	}

	@Override
	public void delete(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
//				friends[i] = null;
				friends.remove(i);
				System.out.println("한 건 삭제되었습니다.");
				break;
			}
		}
		save();
	}

	@Override
	public List<Friend> selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				return friends.get(i);
			}
		}
		return null; // ?????
	}

	@Override
	public Friend findTel(String tel) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getTel().equals(tel)) {
				return friends.get(i);
			}
		}
		return null;

	}
}
