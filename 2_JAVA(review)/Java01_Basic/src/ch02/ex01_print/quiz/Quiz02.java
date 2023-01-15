package ch02.ex01_print.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int tmp = 0; // 빈 상자
		
		System.out.printf("a; %d, b: %d\n", a, b);
		
		tmp = a;  // tmp = 1
		a = b;	  // a = 3
		b = tmp;  // b = 1
		
		System.out.printf("a; %d, b: %d", a, b);
	}
}
