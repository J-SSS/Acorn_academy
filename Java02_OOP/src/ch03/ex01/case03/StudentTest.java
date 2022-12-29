package ch03.ex01.case03;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("장동일");
		
		Student s2 = new Student();
		s2.setName("장동이");
		
		System.out.printf("학생의 이름은 %s이고, 학번은 %d입니다.\n", s1.getName(), s1.getStudentId());
		System.out.printf("학생의 이름은 %s이고, 학번은 %d입니다.\n", s2.getName(), s2.getStudentId());
	}
}
