package ch01.quiz.case02;

public class Main {
	public static void main(String[] args) {
		
		Fruit apple = new Apple(); // 업케스팅
		Fruit banana = new Banana();
		Fruit orange = new Orange();
		
		apple.output();
		banana.output();
		orange.output();
	}
}
