package ch03.ex01.quiz.Quiz01;

public class BankMain {
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		BankService bs = new BankService();
		
		while (true) {
			int menu = bs.menu();
			
			switch (menu) {
			case 1:
			case 2:
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("없는 메뉴입니다!");
			}
		}
 	}
	
}
