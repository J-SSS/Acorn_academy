package ch02.ex02.quiz.case01;

public class Main {
	public static void main(String[] args) {
		
		Worker worker = new Worker("영수", 20000);
		Taxi taxi = new Taxi("KAKAO");
		
		worker.takeTaxi(taxi);
		
		taxi.showTaxiInfo();
		worker.showWorkerInfo();
	}
}
