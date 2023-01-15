package ch02.ex01.case02;


public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student(1010, "리사");
		Student s2 = new Student(0, null);
		Student s3 = new Student();
		
		s.showStudentInfo();
	}
}
