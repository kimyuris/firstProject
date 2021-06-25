package conditions;

public class WhileExample4 {
public static void main(String[] args) {
//	 1~50 까지 2또는 3의 배수의 합.
//	while구문 사용
	int  i = 1;
	int sum = 0;
	while(i <= 50) {
		if (i%2==0 || i%3==0) {
			sum = sum + i;
		
		}
		i++;
	}
		System.out.println("합계는 : "+ sum);
			
			
		
	}
}

