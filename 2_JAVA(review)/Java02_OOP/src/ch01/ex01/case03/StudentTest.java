package ch01.ex01.case03;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.studentName = "김석영";
		s1.address = "서울";
		s1.showStudentInfo();
		
		Student s2 = new Student();
		s2.studentName = "Aleyna";
		s2.address = "U.S.";
		s2.showStudentInfo();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
