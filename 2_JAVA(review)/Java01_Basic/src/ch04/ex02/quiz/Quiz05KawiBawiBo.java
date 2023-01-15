package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz05KawiBawiBo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int myChoice = 0;
		int appChoice = 0;
		String choice = "";
		String result = "";
		
		// 입력
		System.out.print("1.가위  2.바위  3.보\n>");
		myChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1; // 1 ~ 3
		
		if (1<=myChoice && myChoice <=3) {
			// 처리
			switch (myChoice - appChoice) {
			case -2: case 1:
				result = "You Win!"; break;
			case -1: case 2:
				result = "You Lose..."; break;
			case 0:
				result = "Draw.";
			}
			
			// 출력
			switch (myChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보"; 
			}
			System.out.println("You: " + choice);
			
			switch (appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보"; 
			}
			System.out.println("App: " + choice);
		} else {
			System.out.println("입력오류: 메뉴의 번호를 입력하세요.");
		}
		
		System.out.println(result);
	}
}
