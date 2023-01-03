package ch02.quiz.quiz02;

public class Main {
	public static void main(String[] args) {
		Score[] s = new Score[5];
		Professor[] p = new Professor[5];
		ScoreService ss = new ScoreService();
		MainService ms = new MainService();
		
		while(true) {
		int select = ms.menu();
		int select2 = ms.menu2(select);
		
		switch(select) {
	
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 0:
			System.out.println("프로그램 종료!");break;
		default:
			System.out.println("잘못된 메뉴 선택입니다");break;
		}
		} //while
		
	}
}
