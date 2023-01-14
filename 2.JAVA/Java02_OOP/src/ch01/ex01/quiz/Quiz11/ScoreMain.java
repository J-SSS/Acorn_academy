package ch01.ex01.quiz.Quiz11;

public class ScoreMain {
	public static void main(String[] args) {
		
		ScoreService ss = new ScoreService();
		Score[] s = new Score[3];
		int cnt = 0; // 배열의 인덱스값을 가지는 변수
		
		while (true) {
			int menu = ss.menu();		
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				cnt = ss.input(cnt, s); // cnt++
				break;
			case 2:
				ss.output(cnt, s);
				break;
			case 3:
				ss.modify(cnt, s);
				break;
			case 4:
				cnt = ss.delete(cnt, s); // cnt--
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}