package ch04.ex02.Quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	/*	
		//Q1//////////////////////////////////////
		int num = 0;
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		switch (num % 2) {
		
		case 0:
			System.out.println("짝수 입니다!");break;
		default :
			System.out.println("홀수 입니다!");
		}

		
		//Q2//////////////////////////////////////
		
		System.out.print("\n월을 입력하세요: ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지입니다!");break;
		case 4: case 6: case 9: case 11: 
			System.out.println(month + "월은 30일까지입니다!");break;
		case 2: 
			System.out.println(month + "월은 28일까지입니다!");break;
		default:
			System.out.println(month + "월은 존재하지 않습니다!");
			
		}
		
		//Q3/////////////////////////////////////
		
		System.out.print("\n월을 입력하세요: ");
		int mon = sc.nextInt();
		String season = "";
		
		if (mon == 3 || mon == 4 || mon == 5) {
			season = "봄";
		}
		else if (mon == 6 || mon == 7 || mon == 8) {
			season = "여름";
		}
		else if (mon == 9 || mon == 10 || mon == 11) {
			season = "가을";
		}
		else if (mon == 12 || mon == 1 || mon == 2) {
			season = "겨울";
		}
		else {
			season = "존재하지 않는 달!";
		}
		
		
	
		System.out.println(mon + "월은 " + season + "입니다!");
	*/
		//Q4/////////////////////////////////////
		
	/*
	 * 	char cName = '5';
		int cNum = 0;
		
		System.out.print("카드를 입력 하세요 : ");
		

		switch (cName) {
		case 'T' : cNum = 10; break;
		case 'J' : cNum = 11; break;
		case 'Q' : cNum = 12; break;
		case 'K' : cNum = 13; break;
		case 'A' : cNum = 1; break;
		default:
			cNum = cName - '0';
		}
		System.out.println(cName + " => " + cNum);
*/		
		
		//Q5/////////////////////////////////////
		
		System.out.println();
	
		System.out.print("## 다음 중 하나를 선택하세요! ## \n1.가위  2.바위  3.보\n>>");
		int my = sc.nextInt();
		String card = "";
		int app = (int)(Math.random() * 10)/4+1; //1~3중 랜덤한 값 출력
		int result = my-app; //승패 결정을 위한 계산값
		
		switch(my) { //내가 선택한 번호에 따른 문자열 출력
		case 1: card = "가위";
		System.out.println(" \n You : " + card);break;
		case 2: card = "바위";
		System.out.println(" \n You : " + card);break;
		case 3: card = "보";
		System.out.println(" \n You : " + card);break;
		default:
			System.err.println("입력오류!! 메뉴의 번호를 입력하세요!");return;
			
			
		}
		
		
		switch(app) { // 1랜덤출력값에 대응하는 문자열 출력
		case 1: card = "가위";
		System.out.println(" App : " + card);break;
		case 2: card = "바위";
		System.out.println(" App : " + card);break;
		case 3: card = "보 ";
		System.out.println(" App : " + card);
		
		}
		
		if (my == app) { //계산값의 결과에 따라 승패 결정
			System.out.println("\n >>...Draw...<<");
		}
		else if (result == -1 || result == 2 ) {
			System.out.println("\n >>...You Lose...<<");
		}
		else System.out.println("\n >>...You Win!!...<<");
			
		
	}
}
