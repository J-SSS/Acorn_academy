package ch03.ex01.case02;

public class Sequence {
	
	static int basisNum; // 기준값
	int currentNum;
	
	static void setBasisNum(int basisNum) {
		Sequence.basisNum = basisNum;
	}
	
	int nextNum() {
		currentNum = basisNum++;
		return currentNum;
	}
}
