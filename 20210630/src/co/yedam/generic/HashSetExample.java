package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("박지현");
		names.add("박현진");

		System.out.println("크기 : " + names.size());
		Iterator<String> iter = names.iterator(); // 반복자 생성해주는 메소드. 한번사용하고나면 끝임.중복값 허용안됨.
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("값: " + val);
		}
		System.out.println("==========================");
		names.add("안의정");
		names.add("안의정"); //중복값 허용 안되서 출력이 안됨.
		iter = names.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("값: " + val);
		}
		System.out.println("프로그램 종료.");
	}
}
