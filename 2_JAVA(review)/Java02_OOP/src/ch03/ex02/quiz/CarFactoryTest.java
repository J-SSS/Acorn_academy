package ch03.ex02.quiz;

public class CarFactoryTest {
	public static void main(String[] args) {
		
		CarFactory cf = CarFactory.getInstance();
		
		Car audi1 = cf.createCar();
		Car audi2 = cf.createCar();
		Car audi3 = cf.createCar();
		
		System.out.println(audi1.getCarNum());
		System.out.println(audi2.getCarNum());
		System.out.println(audi3.getCarNum());
	}
}
