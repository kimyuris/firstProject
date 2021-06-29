package referece; //???????

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] names = new String[5];
		names[0] = "Hong";
		names[1] = "Hwang";
		names[2] = "Park";
		names[3] = "Kim";
		names[4] = "Choi";

		String[] orders = new String[5];
		orders[0] = "첫번째";
		orders[1] = "두번째";
		orders[2] = "세번째";
		orders[3] = "네번째";
		orders[4] = "다섯번째";

//	Hong Enter => 첫번째 위치에 있습니다.
//	quit Enter => 프로그램종료.
//  Lee Enter => 이런이름은 없습니다.
		while (true) {
			boolean pass = false;
			System.out.println("이름을 입력하세요 >>>");
			String input = scn.nextLine();

			if (input.equals("quit")) {
				break;
			}
			for (int i = 0; i < names.length; i++) {
				if (input.equals(names[i])) {
					System.out.println(orders[i] + " 입니다.");
					pass = true;
				}

				if (!pass) {
					System.out.println("같은 이름이 없습니다.");
					
				}

//	입력한 값이랑 배열에 들어있는 값 비교. 몇번째 입니다.....

			}
			System.out.println("프로그램 종료.");
		}

	}
}
