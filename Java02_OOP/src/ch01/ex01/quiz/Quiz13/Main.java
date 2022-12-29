package ch01.ex01.quiz.Quiz13;

public class Main {
	public static void main(String[] args) {
		
		
		Worker worker = new Worker("영수", 20000);
		Taxi taxi = new Taxi("KAKAO");
		
		worker.take(taxi);
		
		taxi.showTaxiInfo();
		worker.showWorkerInfo();
	}
}
