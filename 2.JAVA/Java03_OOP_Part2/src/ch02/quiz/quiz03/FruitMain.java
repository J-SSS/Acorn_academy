package ch02.quiz.quiz03;

public class FruitMain {
	public static void main(String[] args) {
	FruitService fs = new FruitService();
	Fruit[] s = new Fruit[5];
	while(true) {
		int select = fs.menu();
	switch(select) {
	case 1:
		fs.input(s); break;
	case 2:
		fs.output(s);break;
	case 3:
		fs.modify(s);break;
	case 4:
		fs.delete(s);break;
	default :
		System.out.println("잘못된 메뉴 선택입니다!");
	}
	}
}

}
