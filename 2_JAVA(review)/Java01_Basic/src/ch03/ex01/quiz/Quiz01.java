package ch03.ex01.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a+b);
	}
}
