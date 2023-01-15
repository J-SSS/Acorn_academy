package ch04.ex04.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int cnt = 0; // 자릿수
		int sum = 0; // 각 자릿수들을 더한 합
		
		while (num!=0) {	 // 123  12   1  0
			sum += num%10; // 3	 +2	 +1
			num = num/10;  // 12	1	  0
			cnt++;			 // 1	2	  3
		}
		
		System.out.println("자릿수: " + cnt);
		System.out.println("총합: " + sum);
	}
}
