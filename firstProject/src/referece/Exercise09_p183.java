package referece;

import java.util.Scanner;

public class Exercise09_p183 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : ");
					int score = scanner.nextInt();
					if (score > 100) {
						i--; // 다시 입력하는부분으로 돌아가기 위해서 입력.
						System.out.println("잘못된 점수입니다. 다시입력하세요.");
						
					} else {
						scores[i] = score;
					}

				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int maxValue = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("최고점수 : " + maxValue);
				System.out.println("평균점수 : " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
}
