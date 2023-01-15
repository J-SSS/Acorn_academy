package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int result=0;
		
		do {
			// presentation logic
			System.out.print("숫자1: ");
			num1 = sc.nextInt();
			System.out.print("숫자2: ");
			num2 = sc.nextInt();
			
			// business logic
			result = num1 + num2;
			System.out.printf("%d + %d = %d\n", num1, num2, result);
		} while(result != 0);
		
		System.out.println("합계가 0이므로 프로그램을 종료합니다");
	}
}
