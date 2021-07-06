package co.yedam.inheritance;

public class ArtistExample {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();

		Artist artist = new Artist();
		artist.paint(tri);//위의 값 중 어떤값이 매개값으로 들어오느냐에 따라 출력내용이 달라짐.
//		매개값 = paint() 괄호 안의 값. 매개변수의 다형성을 보여줌.
	}
}
