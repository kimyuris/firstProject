package conditions;

public class ForExample3 {
public static void main(String[] args) {
	

	int sum = 0;
	for(int i=1; i <=50; i++) {
		if(i %2== 0 || i % 3==0) {
			sum= sum +i;
			
		System.out.println("i : "+i+", sum : " + sum);	
		}
		
	}
	System.out.println("합계 "+sum);
}
}
