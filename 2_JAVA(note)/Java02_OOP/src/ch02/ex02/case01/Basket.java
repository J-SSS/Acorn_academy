package ch02.ex02.case01;

public class Basket {
	
	private Apple apple; //바구니 안에 사과(다른 클래스)가 있다!
	
	public Apple getApple() {//바구니에서 사과를 꺼낸다.
		
		return apple;
	}
	
	public void setApple(Apple apple) {//바구니에 사과를 집어넣는다
		this.apple = apple;
	}
}
