package ch01.ex01.quiz.Quiz14;

public class Main {
	public static void main(String[] args) {
		
		Worker A = new Worker("A", 10000);
		Worker B = new Worker("B", 10000);
		
		Bus b400 = new Bus(400);
		Bus b500 = new Bus(500);
		
		Subway s1 = new Subway(1);
		Subway s2 = new Subway(2);
		
		B.showWorkerInfo();
		b400.showBusInfo();
		b500.showBusInfo();
		
		System.out.println();
		
		A.showWorkerInfo();
		s1.showBusInfo();
		s2.showBusInfo();
		
		
	}
}
