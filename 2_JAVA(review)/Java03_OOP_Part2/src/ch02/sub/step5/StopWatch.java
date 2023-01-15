package ch02.sub.step5;

public abstract class StopWatch {
	// 필드
	long startTime;
	long endTime;
	
	// 추상메소드
	abstract void start();
	abstract void stop();
	abstract long getElapsedTime();
	abstract void execute() throws InterruptedException;
}
