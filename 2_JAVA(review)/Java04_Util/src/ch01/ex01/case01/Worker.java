package ch01.ex01.case01;

public class Worker {
	
	private int workerId;
	private String workerName;
	
	public Worker(int workerId, String workerName) {
		this.workerId = workerId;
		this.workerName = workerName;
	}
	
	@Override
	public String toString() {
		return workerId + ", " + workerName;
	}
}

