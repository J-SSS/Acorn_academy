package ch04.ex04;

public class C01While {
	public static void main(String[] args) {
		// while(조건식/boolean) { 반복할 실행문 }		
//		while (true) {
//			System.out.println(1);
//		}
		
		int i=0; // 시작값
		while (i < 5) { // 조건식/종료식이 true인 동안 반복
			System.out.println(i);
			i++; // 증감식
		}
		
		System.out.println("\nNumber that came out: " + i);
	}
}
