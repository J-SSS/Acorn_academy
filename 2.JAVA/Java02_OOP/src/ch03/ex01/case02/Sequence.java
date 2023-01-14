package ch03.ex01.case02;

public class Sequence {

	
	static int basisNum; // 기준값
	int currentNum;
	
	static void setBasisNum(int Num) {
//		this.basisNum = basisNum; //객체가 아닌 데이터영역에 있는 개념이기때문에 this를 붙일 수 없음
		Sequence.basisNum = Num;
	}
	
	int nextNum() {
		currentNum = basisNum++;
		return currentNum;
	}
	
}
