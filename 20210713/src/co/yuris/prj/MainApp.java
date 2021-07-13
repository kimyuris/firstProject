// 모든 class는 main()을 만들지 말것
// main()는 MainApp class에만 만들 것
// project 내에서 MainApp는 하나만 존재(매일 새로운 project 만들 예정. -> 조원덕 교수님)
// class 안에 class 만들지 말 것(중첩클래스 안만들어도 됨)
package co.yuris.prj;

public class MainApp {

	public static void main(String[] args) {
// 		예시 1
// 		Hellojava hellojava = new Hellojava(); // class를 생성, 인스턴스 한개를 생성함.
//		hellojava.setStr("안녕하세요"); // Setter를 통해 값을 출력
//		hellojava.toString();
//		System.out.println(hellojava.getStr() + "========"); // Getter를 통해 값을 출력

//		예시2
//		IfTest ifTest = new IfTest(); // 사용 할 클래스를 초기화 한다.(인스턴스 1개 생성)
//		Hellojava hellojava = new Hellojava("이프 연습인가요?");
//
//		ifTest.simpleIf();
//		hellojava.toString();
//		ifTest.ifElseIf();
//
//		ifTest.ifElseTest();

//		예시3
//		ForTest forTest = new ForTest();
//		forTest.singleFor();
//		forTest.doubleFor();
//		forTest.forEach();

		MenuTest mainMenu = new MenuTest();
		mainMenu.run();
	}
}
