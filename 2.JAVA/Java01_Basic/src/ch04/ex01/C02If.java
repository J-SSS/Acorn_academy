package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		
		int visitCnt = 0;
		
		if (visitCnt < 1) {
			System.out.println("첫방문!");
			visitCnt++;
			return; // 실행 중인 메소드(=여기서는 main이 메소드임)를 종료하고, 호출한 곳으로 이동함
			
			
		}
		if (visitCnt >= 1) {
			System.out.println("재방문!");
		}
	}
}
