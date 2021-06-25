package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
//	임의의 수 1,2,3 생성
//	사용자 값 입력 :2 입력 시 임의의 값과 사용자 입력값 비교해서 맞으면 정답입니다. 다르면 틀렸습니다.
//	임의의 수 생상해주는 변수와, 사용자 값 입력담아주는 변수 필요
//	비교해서 if랑 else if로 

		int val = (int) ((Math.random() * 3) + 1);
		System.out.println("사용자값입력 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		if (val == score) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}

	}

}
