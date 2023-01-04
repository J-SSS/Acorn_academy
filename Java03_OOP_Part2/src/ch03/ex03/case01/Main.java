package ch03.ex03.case01;

public class Main {
	public static void main(String[] args) {
		
		SmartCar appleCar = new Apple();
		GoogleCar googleCar = new GoogleCar();
		
		MyCar car1 =  new MyCar(googleCar); //업캐스팅 //DI
		MyCar car2 =  new MyCar(appleCar); 
		
		car1.start();
		car1.stop();
		car1.klaxon();
		
		System.out.println();
		
		car2.start();
		car2.stop();
		car2.klaxon();
		
		
	}
}
