package ch01.sub.case02;

public class Florist {

	public Flower sell(String flowerName) {
		Flower flower = null;
		
		switch(flowerName) {
		case "백합": flower = new Lily(); break;			
		case "장미": flower = new Rose();
		}
		
		return flower;
	}
}
