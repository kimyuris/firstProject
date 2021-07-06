package co.yedam.abstracts;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer= null; // 추상클래스는 인스턴스를 못만든다....(단순 상속받아 처리할 용도로 만들어짐)
		printer = new SamsungPrinter("ML6");
		printer.turnOn();
		printer.printing();
		printer.turnOff();

		printer = new CanonPrinter("Epson");
		printer.turnOn();
		printer.printing();
		printer.turnOff();

	}
}
