package ch02.ex02.case02;

public class Dealer {
	
	Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice()*2);
		return apple;
	}

}
