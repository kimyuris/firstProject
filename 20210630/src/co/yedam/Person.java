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
		return "{이름: " + this.name + " 나이: " + this.age + " 키: " + this.height + " 혈액형: " + this.bloodType + "}";
	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setAge(int age) {
//		if (age < 0) {
//			this.age = 0;
//		} else {
//			this.age = age;
//		}
//	}
//
//	public int getAge() {
//		return this.age;
//	}
//
//	public void setHeight(double height) {
//		if (height < 0) { // 비정상적인 값이 들어오면 차단
//			this.height = 0;
//		} else {
//			this.height = height;
//		}
//	}
//
//	public double getHeight() {
//		return this.height;
//	}
//
//	public void setBloodType(String bloodType) {
//		this.bloodType = bloodType;
//	}
//
//	public String getBloodType() {
//		return this.bloodType;
//	}

}
