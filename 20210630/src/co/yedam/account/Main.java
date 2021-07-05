package co.yedam.account;

//실행클래스(main)
public class Main {
	public static void main(String[] args) {
		AccountApp app = AccountApp.getInstance();
		app.exe();//방법1

//		AccountApp.getInstance().exe();//방법2
	}
}
