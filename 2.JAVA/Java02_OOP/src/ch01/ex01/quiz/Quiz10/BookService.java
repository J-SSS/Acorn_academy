package ch01.ex01.quiz.Quiz10;

import java.util.Scanner;

public class BookService {
	Scanner sc = new Scanner(System.in);
	
	int num() {
		System.out.print("등록할 책 수 입력 : ");
		int num= sc.nextInt();
		return num;
	}
	

	void input(Book[] book) {
		for(int i=0; i<book.length ; i++) {
			book[i]=new Book();
			System.out.println();
			System.out.println("책 이름 입력: ");
			book[i].name = sc.next();
			System.out.println("책 저자 입력: ");
			book[i].author = sc.next();
			System.out.println("책 가격 입력: ");
			book[i].price = sc.nextInt();
		}
	}
	int menu() {
		System.out.println();
		System.out.println("1. 등 록");
		System.out.println("2. 출 력");
		System.out.println("0. 종 료");
		System.out.print(">> ");
		int select = sc.nextInt();
		return select;
	}
	
	void output(Book[] book) {
		for(int i=0; i<book.length ; i++) {
			System.out.println();
			System.out.println("### " + book[i].name +" ###");
		
			System.out.println("저 자 : " + book[i].author);
		
			System.out.println("가 격 : " + book[i].price);
		}
	}
			
	
	
	
	
}
