package ch02.sub.step5;

public class MilliStopWatch extends StopWatch {
	
	@Override
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	@Override
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	@Override
	public long getElapsedTime() {
		return endTime - startTime;
	}

	@Override
	void execute() {
		start();
		System.out.println(startTime);
		
		for (long i=0; i<3_000_000_000_000_000_000L; i++) {			
		}
		
		stop();
		System.out.println(endTime);
		
		long mTime = getElapsedTime();  
		System.out.printf("경과시간: %d", mTime);
	}
}
