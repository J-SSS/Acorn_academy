package ch04.ex01.quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		//Q1////////////////////////////////
	/*	Scanner sc = new Scanner(System.in);
		
		int a = 0;
		System.out.print("숫자를 입력하세요 :");
		a = sc.nextInt();
		
	
		if (a % 2 == 0) {
			System.out.println("짝수입니다!");
		}
		else {
			System.out.println("홀수입니다!");
		}
		*/
		
/*		//Q2/////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("<<<<<<메뉴>>>>>>"
				+ "\n1.입력\n2.출력\n3.수정\n4.삭제\n0.프로그램 종료\n>");
		num = sc.nextInt();
		
		if (num==1)
			System.out.println("입력 페이지 입니다.");
		else if (num==2)
			System.out.println("출력 페이지 입니다.");
		else if (num==3)
			System.out.println("수정 페이지 입니다.");
		else if (num==4)
			System.out.println("삭제 페이지 입니다.");
		else if (num==0)
			System.out.println("프로그램 종료!");
		else 
			System.out.println("없는 메뉴 번호입니다!");
*/
		//Q3/////////////////////////////////
		Scanner sc = new Scanner(System.in);
		String name = "";
		int local = 0;
		String local2 = "";
		System.out.print("이름 입력: ");
		name = sc.next();
		
		System.out.println(" ### 출생 지역 선택 ###"
				+ "\n1. 서울\n2. 경기도권\n3. 강원도권\n4. 충청도권\n5. 경상도권\n6. 전라도권\n7. 제주도권\n");
		System.out.print("출생 지역 선택 : ");
		
		local = sc.nextInt();
		
		if (local == 1)
			local2 = "서울";
		else if (local ==2)
			local2 = "경기도권";
		else if (local ==3)
			local2 = "강원도권";
		else if (local ==4)
			local2 = "충청도권";
		else if (local ==5)
			local2 = "경상도권";
		else if (local ==6)
			local2 = "전라도권";
		else if (local ==7)
			local2 = "제주도권";
		
		
		
		System.err.printf(name + "님의 출생지는 " + local2 + "입니다.");
		//Q4/////////////////////////////////
	}
	

		
	}
	
