package ch02.quiz.case02;

public class Main {
	public static void main(String[] args) {
		
		Score[] s = new Score[5];
		Professor[] p = new Professor[5];
		MainService ms = new MainService();
		
		while (true) {
			int menu = ms.menu();
			
			switch (menu) {
			case 1:
				ms.input(s, p);
				break;
			case 2:
				ms.output(s, p);
				break;
			case 3:
				ms.modify(s, p);
				break;
			case 4:
				ms.delete(s, p);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
