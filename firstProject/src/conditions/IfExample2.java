package conditions;

import java.util.Scanner;
// scanner 사용할 때는 단독으로 쓸 수 없어서 이렇게 입력 후 단독사용가능. 

public class IfExample2 {
	public static void main(String[] args) {
//	사용자의 입력값을 읽어들이는 클래스 Scanner
		Scanner scanner = new Scanner(System.in);// System.in : 키보드 입력.
		System.out.println("숫자입력..");
		int val = scanner.nextInt();
		System.out.println("입력값: " + val);

// consle창에 숫자 입력하면 입력값: 으로 나옴
	if (val % 2==0) {
		System.out.println("짝수입니다.");
	} else {
		System.out.println("홀수입니다.");
	}
	}
}
