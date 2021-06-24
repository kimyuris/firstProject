package operator;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		val1++;
		val1 = val1 + 2;
		val1 += 2;
		val1--;
		val1 = val1 - 3;
		val1 -= 3;
//	val1 + 2; 를 한번에쓰는게 += 표시 
		System.out.println(val1);

		String str1 = "A";
		str1 = str1 + "B";
		str1 += "C";
		System.out.println(str1);

		String msg = "";
		if (val1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}

		System.out.println(val1 + "은" + msg + "입니다.");

		msg = (val1 % 2 == 0) ? "짝수" : "홀수";
//	위에 내용을 한줄로 표시한 것. String msg = "";
		System.out.println(val1 + "은" + msg + "입니다.");
	}
}
