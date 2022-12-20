package ch03.ex01.quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//Q1//////////////////////////////
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("합계: " + (a+b));
		
		//Q1//////////////////////////////
		
		double c = 3.141592;
		double d = c - (c % 1);
		
		System.out.println(d);
		
		//Q1//////////////////////////////
		//Q1//////////////////////////////
	}
}
