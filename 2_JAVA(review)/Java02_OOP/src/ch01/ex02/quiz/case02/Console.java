package ch01.ex02.quiz.case02;

import java.util.Scanner;

public class Console {
	
	char inYn(String msg) {
		Scanner sc = new Scanner(System.in);
		char choice = 0;
		boolean isGood = false;
		
		do {
			System.out.print(msg + "(y/n)? ");
			String input = sc.nextLine();
			
			if (input.length() == 1) {
				choice = input.charAt(0);
				if (choice=='Y' || choice=='y') choice = 'y';
				else if (choice=='N' || choice=='n') choice = 'n';
			}
			isGood = (choice=='y' || choice=='n');
			
			if (!isGood) System.out.println("ERROR] y or n을 입력해야 합니다.");
		} while(!isGood);		
		
		return choice;
	}
}
