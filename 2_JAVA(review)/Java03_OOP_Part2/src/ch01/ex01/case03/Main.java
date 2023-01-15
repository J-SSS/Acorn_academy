package ch01.ex01.case03;

public class Main {
	public static void main(String[] args) {
		
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		lion.run();
		tiger.run();
		
		lion.shout();
//		tiger.shout();
		
		tiger.eat();
//		lion.eat();
	}
}
/*
	아래 이야기를 상속 관계를 이용해서 디자인해보세요.
	- 과일인 사과 하나와 포도 하나를 마련했습니다.
*/