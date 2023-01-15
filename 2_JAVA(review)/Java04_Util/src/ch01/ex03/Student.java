package ch01.ex03;

public class Student {
	// 필드_멤버변수
	private int stuId;
	private String stuName;
	
	// 생성자(constructor)
	public Student() {}
	
	public Student(int stuId, String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
	}
	
	// 메소드
	public int getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return String.format("%d, %s", stuId, stuName);
	}
}
