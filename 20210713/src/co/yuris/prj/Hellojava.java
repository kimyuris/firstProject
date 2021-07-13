package co.yuris.prj;

public class Hellojava {
	private String str; // 멤버 변수

//	생성자↓
	public Hellojava() {
		// 기본 생성자
	}

	public Hellojava(String str) { // 생성자 오버로딩
		this.str = str;
	}

//	메소드↓
	public String getStr() { // 기억된 값을 가져옴
		return str;
	}

	public void setStr(String str) { // 값을 기억시킴
		this.str = str;
	}

	@Override
	public String toString() { // object 객체로 상속받은 toString메소드를 제정의 함.
		System.out.println(str);
		return null;
	}

}