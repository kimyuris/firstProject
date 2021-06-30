package co.yedam;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setYear("1학년");
		s1.setEnglishScore(53);
		s1.setMathScore(60);

		Student s2 = new Student();

		s2.setName("김길동");
		s2.setYear("1학년");
		s2.setEnglishScore(70);
		s2.setMathScore(88);

		Student s3 = new Student();
		s3.setName("이길동");
		s3.setYear("1학년");
		s3.setEnglishScore(78);
		s3.setMathScore(68);

		Student[] students = { s1, s2, s3 }; // 배열에 담는것(배열선언)
		int maxEng = 0;
		Student maxStudent = null;
		int sum = 0;
		for (int i = 0; i < students.length; i++) {

			if (students[i].getEnglishScore() > maxEng) {
				maxEng = students[i].getEnglishScore();
				maxStudent = students[i];

			}
		}
		System.out.println("최고영어점수 : " + maxStudent.getEnglishScore() + ", 이름 : " + maxStudent.getName() + ", 수학: "
				+ maxStudent.getMathScore());

	}
}
