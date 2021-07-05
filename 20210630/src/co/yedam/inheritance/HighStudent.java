package co.yedam.inheritance;

//아무것도 입력이 안되어 있지만 부모클래스(student)에 입력되어있어서 
//자식클래스(highstudent)에서도 사용가능
//부모클래스+자기자신클래스 모두 사용가능(extends 로 선언가능)
public class HighStudent extends Student {

	
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
	
}
