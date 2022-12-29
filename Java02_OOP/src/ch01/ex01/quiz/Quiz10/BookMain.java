package ch01.ex01.quiz.Quiz10;

public class BookMain {
	public static void main(String[] args) {
		BookService bs = new BookService();
		
		
		
		Book[] b = new Book[bs.num()];
		
	
		
		while(true) {
			int select = bs.menu();
			
			
			switch(select) {
			case 1:
				bs.input(b);break;
			case 2:
				bs.output(b);break;
			case 0:
				System.out.println();
				System.err.println("종 료!");
				return;
			default:
				System.out.println();
				System.err.println("잘못된 메뉴 선택 입니다!");break;
			}
			
		}
	}
}
