package ch03.ex03.quiz.presentation;

import java.util.Scanner;

public interface Console { 
	
	Scanner sc = new Scanner(System.in); // public static final이 생략돼 있음
	
	static int inNumber(String message) {
		int number = 0;
		boolean isGoodValue = false;
		String line = "";
		
		do {
			System.out.print(message + ": ");
			line = sc.nextLine();
			
			if (line.length() > 0 && line.matches("[0-9]*")) {
				number = Integer.parseInt(line);
				if (0 <= number && number <= 100) isGoodValue = true;
			}
			
			if (!isGoodValue)
				System.out.println("ERROR] 0 이상 100 이하의 숫자를 입력하세요.");
		} while(!isGoodValue);
		
		return number;
	}
	
	static void showInfo(String message) { // 문구 출력
		System.out.println("\n" + message);
	}
	
	static void showInfo(Object object) {  // 객체 정보 출력 (toString)
		System.out.println(object);
	}
}
