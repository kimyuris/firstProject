package co.yedam.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("오혜지", 80);
		map.put("은영빈", 81);
		map.put("임효인", 82);
		map.put("은영빈", 83);

		Integer val = map.get("오혜지");
		System.out.println(val);

		Set<String> keys = map.keySet(); // map컬렉션에 있는 키 값만 set컬렉션으로 가져옴
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next(); // key 값을 set컬렉션에서 가져와서
			Integer value = map.get(key); // key를 활용해서 value를 읽어오겠다.
			System.out.println("key: " + key + ", val : " + value);
		}
	}

}
