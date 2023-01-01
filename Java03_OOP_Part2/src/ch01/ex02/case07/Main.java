package ch01.ex02.case07;

public class Main {
	public static void main(String[] args) {
		
		Cat cat = new Cat("시베리안",3);
		
		System.out.printf("%s, %d", cat.getAnimalName(), cat.getAge());
	}
}
