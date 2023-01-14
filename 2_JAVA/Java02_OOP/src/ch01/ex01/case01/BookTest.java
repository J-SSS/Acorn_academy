package ch01.ex01.case01;

public class BookTest { // 실행용 클래스
	public static void main(String[] args) {
		
		Book b1 = new Book(); // 객체 생성_책1권 찍어냄
		b1.title = "해리포터";
		b1.author = "J.K.롤링";
		b1.publisher = "문학수첩";
		b1.page = 500;
		b1.price = 27000;
		b1.dateOfPublication = "2022년 12년 12일";
		
		System.out.println(b1.title);
		
		Book b2 = new Book(); // 객체 생성_책1권 찍어냄
		b2.title = "Rich Dad";
		
		System.out.println(b2.title);
		System.out.println(b2);
		
		
		
		
		
	}
}
