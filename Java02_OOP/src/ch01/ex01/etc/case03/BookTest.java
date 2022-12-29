package ch01.ex01.etc.case03;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		
		System.out.println(library);
		
		library[0] = new Book();
		library[1] = new Book();
		library[2] = new Book();

		library[0].author = "롤링";
		library[0].title = "해리포터1";
		
		library[1].title = "해리포터2";
		library[1].author = "롤링";
		
		library[2].title = "해리포터2";
		library[2].author = "롤링";

		for(int i =0; i<library.length ; i++) {
			library[i].showBookInfo();
		}
		
		
	}
	
}
