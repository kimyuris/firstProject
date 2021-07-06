package co.yedam.inheritance;

public class Student {
	// 필드↓
	private String name;
	private int studNo;
	private String getstudNo;

	// 생성자↓
	public Student() {
		System.out.println("Student() call.");
	}

	public Student(String name, int studNo) {
		super();// Object클래스를 상속받는 클래스라는 뜻
		this.name = name;
		this.studNo = studNo;
	}

	// 메소드↓
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public void showInfo() {
		System.out.println("이름은 " + getName() + " 학생번호는 " + studNo );
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studNo=" + studNo + "]";
	}

}
