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
		return workerId + "," + workerName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Worker){
			Worker w = (Worker) obj;
			
			if (this.workerId == w.workerId) {
				return true;}
				
				else 
					return false;
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

// hashCode() 메소드
// 인스턴스의 저장 주소를 반환함
// 힙메모리에 인스턴스가 저장되는 방식이 hash방식 (hash: 정보를 저장/검색하는 자료구조)
// 자료의 특정 값 (키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용

