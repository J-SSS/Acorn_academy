package ch02.ex02.case02;

public class Retailer {

	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); // 농부한테 구매한 사과의 가격을 2배로 만들어 팜
		return apple;
	}
}
