package ch02.ex02.case01;

public class Main {
	public static void main(String[] args) {
		
		Apple apple = new Apple(); //사과 1개 준비
		apple.setPrice(1000);		//사과 1개에 가격을 입력
		
		Basket basket = new Basket();
		basket.setApple(apple); //바구니에 사과를 담음
		
		// 바구니에서 사과를 꺼내, 그 사과의 가격을 확인함(콘솔에)
		System.out.println(basket.getApple().getPrice());
	}
}
