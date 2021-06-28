package referece;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[3]; // 배열의 크기만 선언.
		intAry = new int[] { 55, 65, 75 }; // 각 값을 지정.
		intAry[2] = 88; // 배열안에 몇번째 인지 꼭 적어야됨 [] 안에 내용!
		intAry[1] = 90;

		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("intAry의 합 : " + sum);

		int[] intAry2 = { 1,2,3,4,5 }; // 배열의 5의 크기의 각 위치에 값을 저장.
		intAry2[0] =81;
		intAry2[1] =82;
		intAry2[2] =83;
		intAry2[3] =84;
		intAry2[4] =85;
		
		
		
		sum = 0;
		for (int i = 0; i < intAry2.length; i++) {
			sum = sum + intAry2[i];
		}
		System.out.println("intAry2의 합 : " + sum);

//		for (int i = 0; i < 3; i++) {
//			System.out.println("값입력 >>>  ");
//			int num = scn.nextInt();
//			intAry[i] = num;
//		}
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
//		System.out.println(intAry[2]);

	}

	public static void artExam() {
		int[] scores = new int[5];
		scores[0] = 70;
		scores[1] = 75;
		scores[2] = 80;
		scores[2] = 88;
		scores[3] = 85;
		scores[4] = 90;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			// System.out.println(scores[i]);

			sum += scores[i];

		}
		double avg = sum / 5.0;
		System.out.println("평균 : " + avg);

	}

	public static void intExam() {
		int score1 = 70;
		int score2 = 75;
		int score3 = 80;
		int score4 = 85;
		int score5 = 90; // 학생이 30명일때 변수 30개 선언, 합해야됨.....--
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;

	}

}
