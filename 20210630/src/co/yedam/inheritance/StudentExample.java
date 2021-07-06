package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
//		System.out.println("Student: " + std.getName() + "," + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println("HighStudent: " + std.getName() + "," + std.getStudNo() + "," + highStd.getSchoolName());

		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;

		students[0].getName();
		students[0].getStudNo();
//		HighStudent hsx = (HighStudent) students[0];//에러는 없지만 출력은 안됨. 부모클래스에서 자식클래스로 형변환 되지만
//		hsx.getSchoolName(); //자식클래스에서 부모클래스로는 형변환이 안됨 그래서 이렇게↓
		if (students[0] instanceof HighStudent) {
			HighStudent hsx = (HighStudent) students[0];
			hsx.getSchoolName();
		}
		students[0].showInfo();
		System.out.println(students[0]);

		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName(); //부모클래스 특징을 가져왔기때문에 출력이 안됨.
//		HighStudent hs = (HighStudent) students[1]; // 자식클래스로 만들려면 강제 형변환 해야됨(HighStudent) 넣어서..
//		hs.getSchoolName();  //부모클래스에서 자식클래스로 형변환 되지만 자식클래스에서 부모클래스로는 형변환이 안됨 
//		그래서 이렇게↓ 자식클래스, 부모클래스 다 변경해야됨(if써서)
		if (students[1] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1];
			hs.getSchoolName();
		}
		students[1].showInfo();
		System.out.println(students[1]);

	}
}
