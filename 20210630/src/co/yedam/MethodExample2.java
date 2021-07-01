package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		String name = p1.getName();
		p1.setName("홍길동");

		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과 : " + result);

//		10~20사이 숫자 만들기
		n1 = p1.getFrom10To20();
		System.out.println("10 ~ 20 : " + n1);

		n2 = p1.getFromTo(10, 30);
		System.out.println("10 ~ 30 : " + n2);

		String p2 = p1.getNameAndAge("박길동", 20);
		System.out.println(p2);

		Person newPerson = p1.createNewPerson("오혜지", 20);
		newPerson.setHeight(167.8);
		newPerson.setBloodType("AB형");
		System.out.println(newPerson.getInfo());

		Person anotherPerson = p1.createNewPerson("권가영", 20, 165.3);
		System.out.println(anotherPerson.getInfo());

		Person theAnotherPerson = p1.createNewPerson("안의정", 20, 166.6, "0형");
		System.out.println(theAnotherPerson.getInfo());

	}
}
