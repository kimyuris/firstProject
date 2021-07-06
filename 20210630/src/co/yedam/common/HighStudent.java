package co.yedam.common;

import co.yedam.modifier.Student;

public class HighStudent extends Student {
	HighStudent(String name) { // protected => 상속관계 시 패키지 달라도 접근가능.
		super(name);
	}
}
