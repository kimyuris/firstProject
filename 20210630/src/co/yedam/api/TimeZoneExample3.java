package co.yedam.api;

import java.text.MessageFormat;

public class TimeZoneExample3 {

	public static void main(String[] args) {
		String date = "회원ID: {0} \n회원 이름: {1} \n회원 전화:{2}";
		System.out.println(MessageFormat.format(date, "123", "홍길동", "1234-5678"));

		System.out.format("회원ID: %s \n회원 이름: %s \n회원 전화: %s", "123", "홍길동", "1234-5678");
	
	}

}

