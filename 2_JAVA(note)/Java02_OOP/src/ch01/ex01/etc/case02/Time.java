package ch01.ex01.etc.case02;

public class Time {
	// 멤버 변수_필드
	int hour;
	int minute;
	int second;
	
	// 메소드
	@Override
	public String toString() { //Object클래스의 메소드를 자동 상속
		return String.format("%d시 %d분 %d초", hour, minute, second);
	}
	//Time 이라는 클래스 속에 있는 변수들을 쉽게 출력해주는 기능을 함.
	//오른쪽클릭->source->generate toString기능 사용
	
	
	void showInfo() { //위와 겉보기엔 동일함
		System.out.println();
	}
}
