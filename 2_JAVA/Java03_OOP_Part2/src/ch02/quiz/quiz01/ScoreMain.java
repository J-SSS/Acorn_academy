package ch02.quiz.quiz01;

public class ScoreMain {
	public static void main(String[] args) {
		
		Score[] s = new Score[5];
		ScoreService ss = new ScoreService();
		
		while (true) {
			int menu = ss.menu();
			
			switch (menu) {
			case 1:
				ss.input(s); // up_casting (Score[] -> Object[])
				break;
			case 2:
				ss.output(s);
				break;
			case 3:
				ss.modify(s);
				break;
			case 4:
				ss.delete(s);
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
