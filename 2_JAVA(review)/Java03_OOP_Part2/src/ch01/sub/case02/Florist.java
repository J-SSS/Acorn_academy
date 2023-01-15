package ch01.sub.case02;

public class Florist {
	
	public Flower sell(String flowerName) {
		Flower flower = null;
		
		switch (flowerName) { // 정수(byte,short,int), char, String (long X)
		case "백합": flower = new Lily(); break;
		case "장미": flower = new Rose(); // up_casting(자동타입변환)
		}
		
		return flower;
	}
}
