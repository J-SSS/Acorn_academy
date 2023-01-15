package ch02.ex01.case02;

public class Student {
	// 필드_멤버 변수(속성)
	int studentId;		
	String studentName; 
	int grade;
	
	// 생성자(Constructor)
	public Student() {} // 직접 만들어야 함
	
	public Student(int studentId) {
		this.studentId = studentId;
	}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student(int studentId, String studentName, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}

	// 메소드-멤버 함수(기능)
	void showStudentInfo() {
		System.out.printf("학번: %d\n이름: %s\n", studentId, studentName);
	}
}

// 생성자의 역할
// 1. 객체 생성
// 2. 필드의 초기화