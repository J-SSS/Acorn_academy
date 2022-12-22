package ch01.ex01.case03;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.studentName = "장동일";
		s1.address = "서울시 은평구";
		s1.showStudentInfo();
		
		Student s2 = new Student();
		s2.studentName = "장동이";
		s2.address = "서울시 마포구";
		s2.showStudentInfo();
	}
}
