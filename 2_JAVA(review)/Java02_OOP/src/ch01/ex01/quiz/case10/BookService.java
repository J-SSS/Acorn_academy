package ch01.ex01.quiz.case10;

import java.util.Scanner;

public class BookService {
	
	Scanner sc = new Scanner(System.in);
	
	public int size() {
		System.out.print("등록할 책 수 입력: ");
		int bookCnt = sc.nextInt();
		return bookCnt;
	}

	public int menu() {
		System.out.println("1. 등록");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");		
		return sc.nextInt();
	}

	public void input(Book[] b) {
		for (int i=0; i<b.length; i++) {
			b[i] = new Book();
			System.out.print("책 이름 입력: ");
			b[i].name = sc.next();
			System.out.print("저자 입력: ");
			b[i].author = sc.next();
			System.out.print("책 가격 입력: ");
			b[i].price = sc.nextInt();
		}
	}

	public void output(Book[] b) {
		for (int i=0; i<b.length; i++) {
			System.out.println("### " + b[i].name + " ###");
			System.out.println("저자: " + b[i].author);
			System.out.println("가격: " + b[i].price);
		}
	}
}
