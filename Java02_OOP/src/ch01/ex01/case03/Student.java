package ch01.ex01.case03;

public class Student {
	// 필드_멤버 변수 - 개체의 속성(데이터 담음)
	int studentId;
	String studentName;
	String address;
	
	
	// 메소드_멤버 함수 - 객체의 기능 구현
	void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
}
