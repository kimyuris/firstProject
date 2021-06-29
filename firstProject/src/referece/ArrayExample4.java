package referece;

import java.util.Scanner;

public class ArrayExample4 {

	static int n = 25;
	static int[] intAry = new int[n];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 중복값 제거 , || = 또는. && = 그리고.

		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
//        이전값과 비교.
			for (int j = 0; j < i; j++) {
				System.out.print(intAry[j] + "\t");
				if (intAry[i] == intAry[j]) {
					pass = false;
					break; // 동일한 값이 있으면 for반복문 빠져나오기.
				}
			}
			if (!pass) {
				i--;
			}
			System.out.println("i: " + i + " : end");
		}

//		int n = 3;
//		System.out.println(intAry[n]);
//		System.out.println(intAry[n - 1]);
//		intAry[0] = 0;
//		intAry[4] = -1;
		for (int i = 0; i < intAry.length; i++) {
			show(i);

			if (i % 5 == 4) {
				System.out.println();
			}
		}

		while (true) {
			System.out.println("숫자 10을 찾으세요(0 ~ 24). ");
			int idx = scn.nextInt();
			if (idx > 24 || idx < 0) { // 잘못된 범위의 값을 넣었을 때
				System.out.println("잘못된 값을 입력하셨습니다.");
				continue; //아랫부분 실행않고 다시 반복의 처음으로 간다는 뜻
			}
		
			
			if (intAry[idx] == 10) {
				System.out.println("찾았습니다. ");
				break;
			} else {
				intAry[idx] = 0;
			}

			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println();
				}
			}
		}
		System.out.println("프로그램이 종료됐습니다.");
	}// main

	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx);// (%2d)표시는 출력할때 3칸으로 표시하겠다는 뜻
		} else {
			System.out.printf("(**)", idx);
		}

	}

}
