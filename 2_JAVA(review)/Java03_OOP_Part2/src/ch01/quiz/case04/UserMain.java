package ch01.quiz.case04;

public class UserMain {
	public static void main(String[] args) {
		
		UserChild2[] uc = new UserChild2[3];
		UserService us = new UserService();
		
		while (true) {
			int menu = us.menu();
			
			switch (menu) {
			case 1:
				us.input(uc);
				break;
			case 2:
				us.output(uc);
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
