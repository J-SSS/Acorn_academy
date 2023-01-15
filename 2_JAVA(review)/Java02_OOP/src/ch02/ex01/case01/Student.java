package ch02.ex01.case01;

public class Student {
	// 필드_멤버 변수(속성)
	int studentId;		// 0 (기본값)
	String studentName; // null (기본값)
	
	// 생성자(Constructor)
	public Student() { // 기본 생성자(default constructor): 만들어진 생성자가 아무것도 없으면, compiler가 자동으로 만들어 준다.
		System.out.println("Default constructor was generated.");
	}
	
	// 메소드-멤버 함수(기능)
	void showStudentInfo() {
		System.out.printf("학번: %d\n이름: %s", studentId, studentName);
	}
}
