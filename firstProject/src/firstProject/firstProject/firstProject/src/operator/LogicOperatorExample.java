package operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int vall = 9;

		if (vall % 2 == 0 && vall % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
//			&&는 and 이라는 뜻
//			||는 or 이라는 뜻

		} else if (vall % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (vall % 2 == 0 && vall % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");

		}

		if (vall % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다. ");
		}
	}
}
