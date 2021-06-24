package variable;

public class BoolExample {
	public static void main(String[] args) {
		boolean existOrNot = true; // boolean 은 참 또는 거짓만 표시 가능
		int notExist = 10;

		existOrNot = notExist != 50; // = 오른쪽 값을 왼쪽에 출력하라는 뜻
//		== 오른쪽과 왼쪽값이 같다는 뜻
//		! not의 의미(반대의 의미-거짓을 참이라고 알려줌)
		if (existOrNot) { // 참 또는 거짓을 나타낼 수 있는 예시
			System.out.println("존재하는 값입니다.");
		}
		byte b = 10;
		System.out.println(Byte.MAX_VALUE); // byte class가 가지고 있는 값의 최대(byte는 -128 ~127)
		if (Byte.MAX_VALUE < 200) {
			System.out.println("참입니다");
		}
		System.out.println(Long.MAX_VALUE);
		System.out.println("end of prog.");
	}
}
