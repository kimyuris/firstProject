package co.yedam.abstracts;

//추상클래스. 직접 생성자를 호출해서 인스턴스 만들지는 못함.

public abstract class Printer {
	private String modelName;

	public Printer() {

	}

	public Printer(String modelName) {
		this.modelName = modelName;
	}

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	public abstract void printing();// 추상메소드. 선언만되어있고 구현되는부분 없음.
	//자식클래스에서 반드시 구현해야됨.!!!
}
