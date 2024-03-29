package ch02.sub.step1;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		// milliseconds로 만든 경과시간
		MilliStopWatch ms = new MilliStopWatch();
		
		ms.startTime = System.currentTimeMillis(); // 1/1_000초
		System.out.println(ms.startTime);
		
		for (long i=0; i<3_000_000_000_000_000_000L; i++) {			
		}
		
		ms.endTime = System.currentTimeMillis();
		System.out.println(ms.endTime);
		
		long mTime = ms.getElapsedTime();  // 1/1_000_000_000초
		System.out.printf("경과시간: %d", mTime);
		
		System.out.println();
		
		
		// nanoseconds로 만든 경과시간
		NanoStopWatch ns = new NanoStopWatch();
		
		ns.startTime = System.nanoTime();
		System.out.println(ns.startTime);
		
//		for (long i=0; i<5_000_000_000_000_000_000L; i++) {
//		}
		TimeUnit.SECONDS.sleep(3);
		
		ns.endTime = System.nanoTime();
		System.out.println(ns.endTime);
		
		long nTime = ns.getElapsedTime();
		System.out.printf("경과시간: %d", nTime);
	}
}

// System.currentTimeMillis();
// 1970년 1월 1일부터 현재까지의 시간을 milliseconds로 반환 (1 seconds = 1000 milliseconds)