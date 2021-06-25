package conditions;

public class IfExample1 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 100) + 1;
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+학점");
			} else {
				System.out.println("D학점");
			}
		} else {
			System.out.println("F학점");
		}
	}
}

//1 ~ 100 까지의 임의의 수
//score변수에 담아서
//score 60이하 f, 
