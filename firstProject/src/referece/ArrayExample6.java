package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
//	배열을 선언. 학생의 점수 scores
//	평균점수와 가장 높은 점수를 구하고
		int[] scores =new int[3]; //{ 90, 80, 84 };
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 84;

		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 20) + 80;

		}
		double avg = 0.0;
		int sum = 0;
		int maxValue = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			}
			sum = sum + scores[i];
			avg = (sum / 3.0);
		}
		System.out.println("평균은 " + avg);
		System.out.println("최고점수는 " + maxValue);
	}

}
