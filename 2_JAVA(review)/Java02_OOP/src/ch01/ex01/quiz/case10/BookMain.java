package ch01.ex01.quiz.case10;

public class BookMain {
	public static void main(String[] args) {
		
		BookService bs = new BookService();
		Book[] b = new Book[bs.size()];
		
		int cnt=0;
		while(true) {
			int menu = bs.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
//				return;
				System.exit(0);
			case 1:
				if (cnt == b.length) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					bs.input(b);
					cnt++;
				}
				break;
			case 2:
				bs.output(b);
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
