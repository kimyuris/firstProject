package co.yedam;

public class Student {
	private String name;
	private String year;
	private int englishScore;
	private int mathScore;

	public Student() {

	}

	public Student(String name) { //매개값을 가지는 생성자.
		this.name = name;
	}

	
	public Student(String name, String year) {
		this.name=name;
		this.year=year;
	}
	
	
	
	public Student(String name, String year, int englishScore, int mathScore) {
		
		this.name = name;
		this.year = year;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

}
