package variable;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 30;
		System.out.println(var1);
		var1 = 60;
		System.out.println(var1);

		long var2 = 100;
		var2 = 200;

		int sum = var1 + (int) var2; // byte, char, short, int, long(크기순서대로)
//       큰단위 수에서 작은수로는 변수적용이 안되서 long -> int는 안됨. 강제형변환 필요

		String name = "Kim";
		char chr = 'A';
		chr++;
		System.out.println((int) chr + "," + chr);

		
		
		
		
		
		
		
	}

}





