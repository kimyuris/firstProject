package basic;

public class AvgExample {
	public static void main(String[] args) {
//	국어, 영어, 수학점수 0~100까지.
//  국어:85, 수학:88, 영어: 83
//	합계, 평균, 
//	학생이름: 

		String name = "kimyuri";
		int kor = 85;
		int math = 88;
		int eng = 83;

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		System.out.println(name + "의 점수합계는 " + sum + ", 평균은 " + avg + "입니다.");

	}
}
