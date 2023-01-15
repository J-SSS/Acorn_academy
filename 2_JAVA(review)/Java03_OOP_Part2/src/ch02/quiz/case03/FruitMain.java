package ch02.quiz.case03;

public class FruitMain {
	public static void main(String[] args) {
		
		Fruit[] f = new Fruit[5];
		FruitService fs = new FruitService();
		
		while (true) {
			int menu = fs.menu();
			
			switch (menu) {
			case 1:
				fs.input(f); // up_casting (Score[] -> Object[])
				break;
			case 2:
				fs.output(f);
				break;
			case 3:
				fs.modify(f);
				break;
			case 4:
				fs.delete(f);
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
