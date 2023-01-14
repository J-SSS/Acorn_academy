package ch03.ex01.case03;

public class Student {

	String name;
	int studentId;
	
	static int serialNum = 10000;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
