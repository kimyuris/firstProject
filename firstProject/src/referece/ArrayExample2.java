package referece;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 22, 17 };
		System.out.println("배열크기 : " + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11;
		int sum = 0;
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값: " + intAry[i]);
			sum = sum + intAry[i];
			if (intAry[i] > maxValue) {
				maxValue = intAry[i];
				System.out.println(intAry[i]);
				System.out.println(maxValue);

			}
			

		}
		System.out.println("합계 : " + sum);
		System.out.println("가장큰값 : " + maxValue);
	}
}
