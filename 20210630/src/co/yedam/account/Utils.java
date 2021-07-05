package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

//사용자가 입력한 값을 문자열로 반환.
	public static String scanString(String arg) {
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	}

	public static String scanNumberString(String arg) {
		String val = "";
		while (true) {
			System.out.print(arg);// 메세지
			val = scn.nextLine();// 입력창
			try {
				Integer.parseInt(val);// 숫자일 경우
				break;
			} catch (Exception e) {// 문자인 경우
				System.out.println("숫자를 입력하세요.");
			}
		}
		return val;
	}

}
