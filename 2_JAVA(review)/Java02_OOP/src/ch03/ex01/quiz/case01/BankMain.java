package ch03.ex01.quiz.case01;

public class BankMain {
	public static void main(String[] args) {
		
		BankService bs = new BankService();
		Bank[] b = new Bank[3];
		
		while (true) {
			int menu = bs.menu();
			
			switch (menu) {
			case 1:
				bs.input(b);
				break;
			case 2:
				bs.output(b);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
}
