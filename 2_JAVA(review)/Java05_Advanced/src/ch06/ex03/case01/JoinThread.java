package ch06.ex03.case01;

public class JoinThread extends Thread {
	
	int start;
	int end;
	int total;
		
	public JoinThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for (i=start; i<=end; i++) {
			total += i;
		}
	}
}
