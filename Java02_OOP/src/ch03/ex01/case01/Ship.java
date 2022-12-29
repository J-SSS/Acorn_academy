package ch03.ex01.case01;

public class Ship {

	int passengerCnt; // 인스턴스 변수 -> 힙 메모리
	static int totalCnt; // 클래스 변수(=static 변수) -> 데이터 영역
	//static을 붙여주면 클래스단위의 데이터영역에 저장된다 -> 클래스급이기때문에 공유됨
	
	public void sail(int passengerCnt) {
		this.passengerCnt = passengerCnt;
		this.totalCnt += passengerCnt;
	}
	
	public int getTotalCnt() {
		return Ship.totalCnt;
	}
	
}
