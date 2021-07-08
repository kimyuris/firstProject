package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	int price;
	String group;

	Apple(String group, int price) {
		this.price = price;
		this.group = group;

	}

	@Override
	public int hashCode() {
		return this.group.hashCode() + this.price; // 동일한종류, 동일한가격인 경우 hashCode는 똑같은 값을 반환.

	}

	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple) obj;
		return this.group.equals(other.group) && this.price == other.price;
	}
}

public class HashSetExample2 {

	public static void main(String[] args) {
		// Set: 중복된 값을 허용하지 않음.
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1500));
		set.add(new Apple("아오리", 1500));
		set.add(new Apple("아오리", 2000));

		Iterator<Apple> iter = set.iterator();
		while (iter.hasNext()) {
			Apple app = iter.next();
			System.out.println("종류 : " + app.group + ", 가격" + app.price);
		}
	}

}
