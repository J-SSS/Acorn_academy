package ch02.ex01.sub.case03;

public class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void showBookInof() {
		System.out.println(title + ", " + author);
	}
}
