package conditions;

public class IfExample {
	public static void main(String[] args) {
//		System.out.println((int) (Math.random() * 6) + 1);
		int ran = (int) (Math.random() * 6) + 1;
		if (ran == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
		}
	}
}


