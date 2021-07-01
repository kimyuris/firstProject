package co.yedam;

public class MethodExample3 {
	public static void main(String[] args) {
		Student s1 = new Student("최예원", "1학년", 80, 85);
		Student s2 = new Student("김지연", "2학년", 70, 77);
		
		Student[] javaClass= {s1,s2,new Student("최유리","2학년",70,75)};
//		s1.setName("최예원");
//		s1.setYear("1학년");
//		 s1.setEnglishScore(80);
//		s1.setMathScore(85);

		System.out.println("2학년 리스트.");
		for(int i=0; i<javaClass.length;i++) {
			if(javaClass[i].getYear().equals("2학년")) {
				System.out.println(javaClass[i].getName() + "," + javaClass[i].getYear()+ "," +javaClass[i].getEnglishScore()+ "," +javaClass[i].getMathScore());
		}
		
//		System.out.println(s2.getName() + "," + s2.getYear()+ "," +s2.getEnglishScore()+ "," +s2.getMathScore());

	}//for
	}//main
}//class
