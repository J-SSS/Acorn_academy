package ch02.sub.step1;

public class NanoStopWatch {
	// 필드
	long startTime;
	long endTime;
	
	// 메소드
	public long getElapsedTime() {
		return endTime - startTime;
	}
}
