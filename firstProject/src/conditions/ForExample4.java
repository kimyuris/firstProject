package conditions;

public class ForExample4 {
	public static void main(String[] args) {
//	1부터 10까지 i 변수 활용해서 10번 반복. int sum = 0;
		forSum();
	}

	public static void whileSum() {
//	while구문 1~10 합
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum = sum + i;

			}
			i++;

		}
		System.out.println("1 ~ 10 까지 짝수의 합 : " + sum);
	}

	public static void forSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println("sum > " + sum + ",+i>" + i);
			}

		}
		System.out.println("1 ~ 10 까지 홀수의 합 : " + sum);
	}
}