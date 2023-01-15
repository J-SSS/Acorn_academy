package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int i1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int i2 = sc.nextInt();
		System.out.print("세번째 정수 입력: ");
		int i3 = sc.nextInt();
		
		int result = (i1>i2 && i1>i3) ? i1 : (i2>i3 ? i2 : i3);
		
		System.out.println("입력받은 수 중 가장 큰 수는 " + result);
	}
}
