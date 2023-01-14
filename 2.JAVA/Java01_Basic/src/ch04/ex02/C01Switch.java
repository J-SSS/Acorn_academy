package ch04.ex02;

import java.util.Scanner;

public class C01Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("### 출생 지역 선택 ###");
		System.out.println("1. 서울");
		System.out.println("2. 경기도권");
		System.out.println("3. 강원도권");
		
		System.out.print("출생 지역 입력: ");
		int local = sc.nextInt();
		
		switch (local){ // 조건문 : int타입과 변환이 가능한 값(byte, short, int, char) 실수, 문자열로 강제변환은 불가능  
			case 1:
				System.out.println("서울");
				break;
			case 2:
				System.out.println("경기도권");
				break;
			case 3:
				System.out.println("강원도권");
				
			
		}
	}
}
