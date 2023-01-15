package ch02.ex02.quiz.case02;

public class Main {
	public static void main(String[] args) {
		
		Worker A = new Worker("A", 10000);
		Worker B = new Worker("B", 10000);
		
		Bus b400 = new Bus(400);
		Bus b500 = new Bus(500);
		
		Subway s1 = new Subway(1);
		Subway s2 = new Subway(2);
		
		A.takeSubway(s1);
		B.takeBus(b500);
		
		B.showWorkerInfo();
		b500.showBusInfo();
		b400.showBusInfo();
		
		System.out.println();
		
		A.showWorkerInfo();
		s1.showSubwayInfo();
	}
}
