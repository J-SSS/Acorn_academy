package ch02.sub.step5;

import java.util.concurrent.TimeUnit;

public class NanoStopWatch extends StopWatch {
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void stop() {
		endTime = System.nanoTime();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}

	void execute() throws InterruptedException {
		start();
		System.out.println(startTime);
		
		TimeUnit.SECONDS.sleep(3);
		
		stop();;
		System.out.println(endTime);
		
		long nTime = getElapsedTime();
		System.out.printf("경과시간: %d", nTime);
	}
}