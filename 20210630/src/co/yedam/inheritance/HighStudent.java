package co.yedam.inheritance;

//아무것도 입력이 안되어 있지만 부모클래스(student)에 입력되어있어서 
//자식클래스(highstudent)에서도 사용가능
//부모클래스+자기자신클래스 모두 사용가능(extends 로 선언가능)
public class HighStudent extends Student {

	// 필드↓
	private String schoolName;

	// 생성자↓
	public HighStudent() {
		System.out.println("HighStudent()");
	}

	public HighStudent(String name, int studNo, String schoolName) {
		super(name, studNo); // Student(String name, int studNo)

		this.schoolName = schoolName;
	}

	// 메소드↓
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override //부모클래스가 가지고있는 메소드를 자식클래스가 재정의(override)한다는 뜻.문법적 오류가 있는지 체크.
	public void showInfo() {
		System.out.println("이름은 " + getName() + " 학생번호는 " + getStudNo() + " 학교는 " + getSchoolName());
	}

	@Override
	public String toString() {
		return "HighStudent [name()=" + getName() + ", studNo()=" + getStudNo() + ", schoolName=" + schoolName
				+ "]";
	}
	
	

	

	
	
	
}
