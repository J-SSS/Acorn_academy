package ch01.ex04;

public class C03Overflow {
	public static void main(String[] args) {
		
		// 값 손실
		int a = 1_000_000;
		int b = 1_000_000;
		long c = a * b; // int*int로 계산
		System.out.println(c); // -727379968
		
		c = a * (long)b; // int*long -> long*long
		System.out.println(c); //1_000_000_000_000
		
		int x = 1_000_000 * 1_000_000 / 1_000_000;
		System.out.println(x); // -727 순서대로 계산하기 때문
		
		int y = 1_000_000 / 1_000_000 * 1_000_000;
		System.out.println(y); // 1_000_000 순서대로 계산하기 때문
	}
}
