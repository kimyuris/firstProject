package referece;

public class PersonExanple {
public static void main(String[] args) {
	Person kyr =new Person(); //실제 존재를 만드는거 : 인스턴스화(개체) 한다고 말함.
	kyr.name="김유리";
	kyr.age=33;
	kyr.height=174.3;
	kyr.weight=55;
	//kyr.birth="19891227"; -필드에 정의되지 않아서 입력할 수 없음(Person class에)
	
	
	kyr.walk();
	kyr.sleep();
	kyr.showInfo();
	
	
	
	
}
}
