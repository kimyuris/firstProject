package conditions;

public class ForExample {
	public static void main(String[] args) {
//	 똑같은 문구 반복으로 사용하고 싶을 때 for 사용

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
// 초기값 0으로 설정 후 조건식5보다 작을때까지 증감식으로 적어 계속 반복으로 출력

			if (i % 2 == 1) {

				sum = sum + i;
				System.out.println("현재 i : " + i);
				System.out.println("현재 sum : " + sum);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (i == 5) {
				break;
			}
			System.out.println("합계 " + sum);

		}
	}
}
