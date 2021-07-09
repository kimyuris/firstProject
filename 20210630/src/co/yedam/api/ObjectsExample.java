package co.yedam.api;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String sno;
	String name;
	int grade;

	Student(String sno, int grade) {
		this.sno = sno;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
//		return this.sno.compareTo(o.sno); // 가나다 순으로 비교(sno 값과 Student o 값 비교.값이 작은것부터 먼저 나열)
		return this.grade - o.grade; // 학년을 기준으로 순위를 정하도록 함.
	}

}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.grade - o2.grade;
	}

}

public class ObjectsExample {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 20;
		Student s1 = new Student("a001", 2);
		Student s2 = new Student("b001", 1);
		Student s3 = new Student("c001", 3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);

		TreeSet<Student> ts = new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);

		System.out.println(ts.first().sno);
	}

}
