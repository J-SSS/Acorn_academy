package ch01.ex01.sub.case02;

public class Time {
	// 멤버 변수_필드
	int hour;
	int minute;
	int second;
	
	// 메소드
	@Override
	public String toString() { // Object 클래스의 메소드를 자동 상속돼 있음
		return String.format("%d시 %d분 %d초", hour, minute, second); // printf()
	}
	
	void showInfo() {
		System.out.printf("%d시 %d분 %d초", hour, minute, second);
	}
}
