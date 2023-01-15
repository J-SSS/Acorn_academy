package ch03.ex01.case03;

public class Student { // 정보은닉(Information Hiding)
	// 필드
	static int serialNum = 10000;
	
	private int studentId;
	private String name;
	
	// 생성자
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	// 메소드-get/set
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
