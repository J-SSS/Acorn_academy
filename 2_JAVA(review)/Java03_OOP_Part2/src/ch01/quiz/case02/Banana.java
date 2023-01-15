package ch01.quiz.case02;

public class Banana extends Fruit {
	
	int price = 1000;
	int amount = 10;
	
	@Override
	void output() {
		System.out.println("가격: " + price);
		System.out.println("수량: " + amount);
	}
}
