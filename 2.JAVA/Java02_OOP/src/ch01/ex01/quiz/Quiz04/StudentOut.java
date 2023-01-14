package ch01.ex01.quiz.Quiz04;

import java.util.Scanner;

public class StudentOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//인원수 입력에 맞춰 배열 생성
		System.out.print("인원수 입력 : ");
		int num = sc.nextInt();
		Student[] s = new Student[num];
		
		//생성된 각 배열에 Student클래스 삽입
		for(int i = 0; i<s.length;i++) {
			s[i] = new Student();
		}
		
		
		int count = 0;
		
		while(true) {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램종료");
		System.out.print("메뉴 선택 : ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
		s[count].info();
		count++;
			break;
		case 2:
			for(int i = 0; i<count;i++) {
				System.err.println("### " + (i+1) + " ### ");
				s[i].result();		
			}
		}//switch
		}//while
	}
}
