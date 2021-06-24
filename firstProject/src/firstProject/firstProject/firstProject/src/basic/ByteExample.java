package basic;

public class ByteExample {
public static void main(String[] args) {
	int numb1 = 125;     // -128 ~ 127
	
	++numb1; //126
	++numb1; //127
	++numb1; // ???
	
	System.out.println(numb1);
	
	
	int numb2 =13;
	int numb3 = 6;
	int rem = numb2 % numb3;
	System.out.println(numb3 + "로 나눈 나머지: " + rem);
}
}