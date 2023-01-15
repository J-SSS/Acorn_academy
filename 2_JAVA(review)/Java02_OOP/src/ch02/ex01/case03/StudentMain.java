package ch02.ex01.case03;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(); // default constructor
		s1.name = "김석영";
		s1.score = 100;
		System.out.println(s1); // toString() 메소드 생략 가능
		
		Student s2 = new Student("이유리");
		s2.score = 200;
		System.out.println(s2);
		
		Student s3 = new Student("윤슬", 300);
		System.out.println(s3);
	}
}
