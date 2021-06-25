package conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 5) + 1;
		switch (ran) {
		case 1:
			System.out.println("1값이 나왔습니다.");
			break;
		case 2:
			System.out.println("2값이 나왔습니다.");
			break;
		case 3:
			System.out.println("3값이 나왔습니다.");
			break;
		default:
			System.out.println("그외");

		}
	}
}
// break를 적어야지 한개 값 계산후에 정답이 나오면 멈추게됨.
// 아니면 2값이나왔습니다. 3값이 나왔습니다 다 나옴.
// default : 그 외라는 뜻