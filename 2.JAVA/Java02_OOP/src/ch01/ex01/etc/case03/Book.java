package ch01.ex01.etc.case03;

public class Book { // 객체를 필드(속성)과 메소드(기능)으로 구분한 class로 만드는 것을 추상화(abstraction)라 함.
	// 멤버변수_필드(속성)
	String title;
	String author;
	int test;
	
	// 멤버함수_메소드(기능)
	void showBookInfo() {
		System.out.println(title + ", " + author);
	}

	
	
	}

