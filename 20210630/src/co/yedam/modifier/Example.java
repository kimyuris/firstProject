package co.yedam.modifier;

public class Example {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.getName();// 동일한 패키지 내에서는 호출 가능

		Student s1 = new Student("홍길동");

	}
}
