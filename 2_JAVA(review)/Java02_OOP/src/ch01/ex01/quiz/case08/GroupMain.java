package ch01.ex01.quiz.case08;

public class GroupMain {
	public static void main(String[] args) {

		GroupService gs = new GroupService();
		Group[] g = new Group[gs.size()];
		
		int cnt = 0; // 배열 객체의 수_인덱스 설정
		while(true) {
			int menu = gs.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				if (cnt == g.length) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					gs.input(g, cnt);
					cnt++;
				}
				break;
			case 2:
				for (int i=0; i<cnt; i++) {
					g[i].output();
				}
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
