package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz02 {	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		
		System.out.print("입력1: ");
		int num1 = sc.nextInt();
		System.out.print("입력2: ");
		int num2 = sc.nextInt();
		
		max = (num1>num2) ? num1 : num2;
		System.out.println(max);
	}
}
