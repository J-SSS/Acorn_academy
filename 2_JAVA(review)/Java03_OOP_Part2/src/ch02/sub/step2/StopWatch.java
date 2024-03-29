package ch02.sub.step2;

public class StopWatch {
	// milliseconds 도메인
	long startTime;
	long endTime;
	
	public void startMilli() {
		startTime = System.currentTimeMillis();
	}
	
	public void stopMilli() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedMilliTime() {
		return endTime - startTime;
	}
	
	// nanoseconds 도메인
	long startNanoTime;
	long endNanoTime;
	
	public void startNano() {
		startNanoTime = System.nanoTime();
	}
	
	public void stopNano() {
		endNanoTime = System.nanoTime();
	}
	
	public long getElapsedNanoTime() {
		return endNanoTime - startNanoTime;
	}
}
