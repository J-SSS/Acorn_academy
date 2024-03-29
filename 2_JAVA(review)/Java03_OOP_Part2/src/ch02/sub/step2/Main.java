package ch02.sub.step2;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		StopWatch s = new StopWatch();
		
		// milliseconds로 만든 경과시간		
		s.startMilli();
		System.out.println(s.startTime);
		
		for (long i=0; i<3_000_000_000_000_000_000L; i++) {			
		}
		
		s.stopMilli();
		System.out.println(s.endTime);
		
		long mTime = s.getElapsedMilliTime();  // 1/1_000_000_000초
		System.out.printf("경과시간: %d", mTime);
		
		System.out.println();
		
		
		// nanoseconds로 만든 경과시간		
		s.startNano();
		System.out.println(s.startNanoTime);
		
		TimeUnit.SECONDS.sleep(3);
		
		s.stopNano();;
		System.out.println(s.endNanoTime);
		
		long nTime = s.getElapsedNanoTime();
		System.out.printf("경과시간: %d", nTime);
	}
}
