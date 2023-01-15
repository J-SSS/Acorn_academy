package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		String day = "";
		
		switch (month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			day = "31일";
			break;
		case 4: case 6: case 9: case 11:
			day = "30일";
			break;
		case 2:
			day = "28일";
			break;
		default:
			day = "없음";
		}
		
		if (day == "없음") 
			System.out.println("해당 월은 존재하지 않습니다.");
		else
			System.out.println(month + "월은 " + day + "까지입니다.");
	}
}
