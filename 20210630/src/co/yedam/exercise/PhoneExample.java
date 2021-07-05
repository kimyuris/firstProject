package co.yedam.exercise;

public class PhoneExample {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setNumber(1);
		p1.setName("홍홍홍");
		p1.setPhone("iPhone");
		p1.setArea("서울");
		System.out.println(p1.setNumber() + "," + p1.setName() + "," + p1.setPhone() + "," + p1.setArea());

	}
}
