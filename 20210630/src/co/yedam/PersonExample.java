package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		int num1 = 10;
		Person p1 = new Person();

		p1.setName("홍길동"); // p1.name = "홍길동";
		p1.setAge(20);// p1.age = 20;
		p1.setHeight(175.5); // p1.height = 175.5; 이렇게 못씀(Person class때문)
		p1.setBloodType("B형");// p1.bloodType = "B형";
		// p1.name = "박길동";

		Person p2 = new Person();
		p2.setName("김길동");// p1.name = "김길동";
		p2.setAge(30);// p2.age = 30;
		p2.setHeight(180.4);// p2.height = 180.4;
		p2.setBloodType("A형");// p2.bloodType = "A형";

		Person[] persons = { p1, p2 };

		Person p3 = new Person();
		persons = new Person[] { p1, p2, p3 };
		p3.setName("김유리");// p3.name = "김유리";
		p3.setAge(33);// p3.age = 33;
		p3.setHeight(174.3);// p3.height = 174.3;
		p3.setBloodType("O형");// p3.bloodType = "O형";

//		새로운 인스턴스(사람)선언: 여러분의 정보를 담아서 ...
		for (int i = 0; i < persons.length; i++) {
			// 나이가 25살 이상인 사람만 조회
			if (persons[i].getAge() >= 25) {
				System.out.println(persons[i].getInfo());
//				persons[i].showInfo();
//				System.out.println("이름은 " + persons[i].getName() + ", 나이는 " + persons[i].getAge() + ", 키는 "
//						+ persons[i].getHeight() + ", 혈액형은 " + persons[i].getBloodType());

			}


		}

//		System.out.println(p1.name+","+p1.age+","+p1.height);

	}

}
