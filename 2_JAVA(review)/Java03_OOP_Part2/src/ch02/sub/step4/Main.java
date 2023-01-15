package ch02.sub.step4;

import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void run(MilliStopWatch ms) {		
		ms.start();
		System.out.println(ms.startTime);
		
		for (long i=0; i<3_000_000_000_000_000_000L; i++) {			
		}
		
		ms.stop();
		System.out.println(ms.endTime);
		
		long mTime = ms.getElapsedTime();  // 1/1_000_000_000초
		System.out.printf("경과시간: %d", mTime);
	}
	
	public static void run(NanoStopWatch ns) throws InterruptedException {
		ns.start();
		System.out.println(ns.startTime);
		
		TimeUnit.SECONDS.sleep(3);
		
		ns.stop();;
		System.out.println(ns.endTime);
		
		long nTime = ns.getElapsedTime();
		System.out.printf("경과시간: %d", nTime);
	}	
	
	public static void main(String[] args) throws InterruptedException {
		
		// milliseconds로 만든 경과시간		
		MilliStopWatch ms = new MilliStopWatch();	
		run(ms);		
		
		System.out.println();		
		
		// nanoseconds로 만든 경과시간	
		NanoStopWatch ns = new NanoStopWatch();
		run(ns);
	}
}
