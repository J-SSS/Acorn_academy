package ch01.ex02.quiz.case02;

public class Ball {
	// 필드
	private int num;
	
	// 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return num + "";
	}
}
