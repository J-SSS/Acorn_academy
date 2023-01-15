package ch02.ex01.sub.case03;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("해리포터1", "롤링"));
		library.add(new Book("해리포터2", "롤링"));
		library.add(new Book("해리포터3", "롤링"));
		
		for (int i=0; i<library.size(); i++) {
			library.get(i).showBookInof();
		}
	}
}
