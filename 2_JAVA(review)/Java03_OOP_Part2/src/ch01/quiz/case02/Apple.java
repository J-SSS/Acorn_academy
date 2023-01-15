package ch01.quiz.case02;

public class Apple extends Fruit {
	
	int price = 1500;
	int amount = 5;
	
	@Override
	void output() {
		System.out.println("가격: " + price);
		System.out.println("수량: " + amount);
	}
}
