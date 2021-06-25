package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
//	임의의 수 =. 가위바위보
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}
		Scanner scn = new Scanner(System.in);
		System.out.println("가위,바위, 보 >>>>");
		String str = scn.nextLine();

		if(rsp.equals("same")) {
		
		} else if(rsp.equals("가위")){
			if(str.equals("가위"))
				System.out.println("same");
		}else if(str.equals("바위")) {
				System.out.println("You Win");
		}else if(str.equals("보")) {
				System.out.println("You Lose");
		}

	
	
	
	
	}
		
		
//조건문 컴퓨터 가위바위보, 내가입력하는 가위바위보 비교해서 
//이겼습니다.졌습니다.비겼습니다.출력하기
	}

