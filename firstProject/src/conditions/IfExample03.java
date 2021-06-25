package conditions;

import java.util.Scanner;

public class IfExample03 {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 3) + 1;
		if (ran == 1) {
			System.out.println("가위");
		} else if (ran == 2) {
			System.out.println("바위");

		} else {
			System.out.println("보");
		}
		System.out.println("가위바위보 ");

		Scanner scanner = new Scanner(System.in);
		String ran1 = scanner.nextLine();

		String anyVal = "보";
		System.out.println(anyVal);
		System.out.println(ran1);
		
		if (anyVal.equals(ran1)) {

			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

	}

}
// 문자일때 같다는 표시는 equals
// 숫자일때 같다는 표시는 ==