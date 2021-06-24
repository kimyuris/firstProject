package operator;

public class BiteExample {
	public static void main(String[] args) {
		int numb1 = 10;

		System.out.println("numb1의 값: " + (~numb1 + 1));
// ~는 +1에 부호변경임

		String name = "김유리";
		String str = getName(name);
		System.out.println(str);
		
		
		
		int var1, var2, result;
		var2 = var1 = 10;
		result = var1 + var2;
		result = sum(var1, var2);
				System.out.println("결과값: " + result);
	}
	
	public static int sum(int a, int b) {
		int val = a + b - 5;
		return val;
	}
	
	public static String getName(String n) {
		String name = "Welcome " + n;
		return name;
	}
	
	
	
}
