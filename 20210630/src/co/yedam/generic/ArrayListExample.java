package co.yedam.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("권가영");
		names.add("김유리");
		names.add("김유리");
		names.add("김지연");
		names.add(1, "박라원");
		names.remove(0);
//		names.remove("김유리");
//		names.clear();

		System.out.println("크기 " + names.size()); // java.lang.String
		for (int i = 0; i < names.size(); i++) {
			System.out.println("i값 " + i + ", name: " + names.get(i));
		}
		names = new LinkedList<String>();

	}
}
