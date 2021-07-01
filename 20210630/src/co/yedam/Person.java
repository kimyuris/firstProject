package co.yedam;

public class Person {
//	이름, 나이, 키, 혈액형
	private String name;
	private int age;
	private double height;
	private String bloodType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() {
		System.out.println(
				"[이름: " + this.name + " 나이: " + this.age + " 키: " + this.height + " 혈액형: " + this.bloodType + "]");
	}

	public String getInfo() {
		return "{이름: " + this.name + " 나이: " + this.age + " 키: " + this.height+"}";
	}

	public int getSum(int n1, int n2) {
		return n1 + n2;
	}

//	10~20 사이의 임의의 값을 설정해주는 메소드.

	public int getFrom10To20() {
		return (int) ((Math.random() * 10) + 10);
	}

	public int getFromTo(int n1, int n2) {
		return (int) ((Math.random() * (n2 - n1)) + n1);
	}

//	 매개값으로 문자(이름), 숫자(나이)=> 제이름은 ?? 이고 나이는 ?? 입니다.
//   getNameAndAge()	

	public String getNameAndAge(String p1, int p2) {

		return "제 이름은 " + p1 + " 이고, 나이는" + p2 + "입니다.";

	}

	public Person createNewPerson(String name, int age) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);

		return psn;
	}

	public Person createNewPerson(String name, int age, double height) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setHeight(height);
		return psn;
		// return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height+"입니다";
	}

	public Person createNewPerson(String name, int age, double height, String bloodTpye) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setHeight(height);
		psn.setBloodType(bloodTpye);
		return psn;

	}
}
