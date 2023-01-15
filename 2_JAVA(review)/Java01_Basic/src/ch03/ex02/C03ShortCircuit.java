package ch03.ex02;

public class C03ShortCircuit {
	public static void main(String[] args) {
		// 빠른 AND와 빠른 OR - Short Circuit Evaluation
		boolean b = false;
		int x=0, y=0;
		
		b = ++x < 0 && ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = y = 0;
		b = ++x > 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
