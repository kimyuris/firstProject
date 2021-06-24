package operator;

public class ifExample {
 public static void main(String[] args) {
//	if () {}
	 int v1 = 20;
	 int v2 = 20;
	 
	 if (v1 > v2) {
		 System.out.println("v1 이 v2 보다 큽니다.");
	 } else if (v1 == v2 ) {
//		 숫자가 같을때는 ==로 표시
//		 문자가 같을때는 .equals 로 표시
		 System.out.println("v1과 v2는 같습니다.");
	 } else {
		 System.out.println("v2가 v1보다 큽니다.");
//		 else가 제일 마지막에 나오는조건.
	 }
	 
	 
	 
	 String str1 = "홍길동";
	 String str2 = "홍길동";
	 String str3 = new String("홍길동");
	 
	 if (str1.equals (str3))
	 { 
		 System.out.println("같은 이름입니다.");
	 } else {
		 System.out.println("다른 이름입니다.");
	 }
	 System.out.println("end of prog.");
}
}
