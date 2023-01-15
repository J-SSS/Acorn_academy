package ch02.sub.step3;

public class NanoStopWatch {
	
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void stop() {
		endTime = System.nanoTime();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
}
