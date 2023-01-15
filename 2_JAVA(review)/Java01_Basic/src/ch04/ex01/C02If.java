package ch04.ex01;

public class C02If {	
	public static void main(String[] args) {
		
		int visitCnt = 0;
		
		if (visitCnt < 1) {
			System.out.println("첫방문");
			visitCnt++;
			return; // 실행 중인 메소드를 종료하고 호출한 곳으로 이동
		}
		
		if (visitCnt >= 1) {
			System.out.println("재방문");
		}
	}
}
