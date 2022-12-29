package ch02.ex01.case01;

public class Student {
	// 필드_멤버 변수(속성)
	
	int studentId; //0(기본값)
	String studentName; //null(기본값)
	
	// 생성자(Constructor)
	public Student() { // 기본 생성자(default constructor): 만들어진 생성자가 아무것도 없으면, compiler가 자동으로 만들어준다.
		System.out.println("Default constructor was generated");
	}
	
	// 메소드_멤버 함수(기능)
	void showStudentInfo() {
		System.out.printf("학번: %d\n이름: %s",studentId, studentName);
	}
	
}
/*
 * 생성자의 역할
 * 1. 객체 생성
 * 2. 필드의 초기화
 * 
 * 
 */
