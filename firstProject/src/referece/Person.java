package referece;

// 현실세계의 사람(object)=> 필드, 메소드로 구분
public class Person {
//필드 선언

	int age; // 나이
	String name; // 이름
	double height; // 키
	double weight; // 몸무게

//메소드 선언
void walk() { //기능을나타낼때는(걷는다) 끝에 ()써줘야됨
	System.out.println("걷습니다.");
	}



void sleep() {
	System.out.println("잠을 잡니다.");
}

void showInfo() {
	System.out.println("이름은 "+ name +"이고 나이는 "+ age+"입니다.");
}

}
