package ch03.ex01.case01;

public class Ship {
	
	int passengerCnt;	 // 인스턴스 변수(멤버 변수)   -> 힙 메모리
	static int totalCnt; // 클래스 변수(static 변수)  -> 데이터 영역
	
	public void sail(int passengerCnt) {
		this.passengerCnt = passengerCnt;
		this.totalCnt += passengerCnt;
	}
	
	public int getTotalCnt() {
		return Ship.totalCnt;
	}
}
