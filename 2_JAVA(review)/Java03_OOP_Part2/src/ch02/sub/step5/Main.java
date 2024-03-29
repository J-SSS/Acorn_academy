package ch02.sub.step5;

public class Main {
	
	public static void run(StopWatch s) throws InterruptedException {
		s.execute();
	}	
	
	public static void main(String[] args) throws InterruptedException {
		
		// milliseconds로 만든 경과시간		
		MilliStopWatch ms = new MilliStopWatch();	
		run(ms); // 업캐스팅	
		
		System.out.println();		
		
		// nanoseconds로 만든 경과시간	
		NanoStopWatch ns = new NanoStopWatch();
		run(ns); // up_casting
	}
}
