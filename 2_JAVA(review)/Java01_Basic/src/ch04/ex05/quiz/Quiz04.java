package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor=0, eng=0, math=0, sum=0;
		String name="";
		
		while(true) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				System.out.println("## 성적 입력 ##");
				System.out.print("이름 입력: ");
				name = sc.next();
				
				do {
					System.out.print("국어 점수 입력: ");
					kor = sc.nextInt();
					if (kor<0 || kor>100)
						System.out.println("\n0이상 100이하의 점수만 입력 가능합니다.");
				} while(kor<0 || kor>100);
				
				do {
					System.out.print("영어 점수 입력: ");
					eng = sc.nextInt();
					if (eng<0 || eng>100)
						System.out.println("\n0이상 100이하의 점수만 입력 가능합니다.");
				} while(eng<0 || eng>100);
				
				do {
					System.out.print("수학 점수 입력: ");
					math = sc.nextInt();
					if (math<0 || math>100)
						System.out.println("\n0이상 100이하의 점수만 입력 가능합니다.");
				} while(math<0 || math>100);	
				
				sum = kor + eng + math;
				break;
			case 2:
				System.out.println("## 성적 출력 ##");
				System.out.println("이름: " + name);
				System.out.println("총점: " + sum);
				System.out.println("평균: " + sum/3.0);
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}
}
