package ch01.ex01.case06;

public class Worker implements Cloneable {
	
	private int workerId;
	private String workerName;
	
	public Worker(int workerId, String workerName) {
		this.workerId = workerId;
		this.workerName = workerName;
	}
	
	public void setWorkerName(String name) {
		this.workerName = name;
	}
	
	@Override
	public String toString() {
		return workerId + ", " + workerName;
	}

	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof Worker) {
			Worker w = (Worker) obj;
			if (this.workerId == w.workerId)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return workerId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
