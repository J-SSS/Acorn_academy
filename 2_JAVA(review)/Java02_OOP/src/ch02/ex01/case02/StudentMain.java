package ch02.ex01.case02;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(9000001, "리사");
		Student s2 = new Student();
		Student s3 = new Student(9000002, "수영", 100);
		
		s1.showStudentInfo();
		s2.showStudentInfo();
		s3.showStudentInfo();
	}
}
