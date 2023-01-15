package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (double)total / 3;
		grade = (avg>=90) ? 'A' : (avg>=80) ? 'B' : (avg>=70) ? 'C' : 'D';
		
		System.out.printf("총점: %d\n평균: %.1f\n학점: %c", total, avg, grade);
	}
}
