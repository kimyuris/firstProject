package exercise;

public class Employee {
	private int number;
	private String name;
	private String email;
	private int money;
	private String group;

	public Employee(int number, String name, String email, int money, String group) {
		this.number = number;
		this.name = name;
		this.email = email;
		this.money = money;
		this.group = group;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String showInfo() {
		String employee = "사원번호 : " + number + " 이름 : " //
				+ name + " 이메일 : " + email;
		return employee;

	}
//사원번호
//	이름
//	이메일
//	급여
//	부서

//	메소드 정의.
//	get, set 문서 만들기

}
