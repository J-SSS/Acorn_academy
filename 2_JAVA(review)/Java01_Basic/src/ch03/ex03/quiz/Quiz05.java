package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		
		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.printf("x의 절대값: %d\ny의 절대값: %d", absX, absY);
	}
}
