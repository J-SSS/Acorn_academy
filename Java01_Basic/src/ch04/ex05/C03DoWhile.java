package ch04.ex05;

import java.util.Scanner;

public class C03DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		boolean isOne = false;
		String errMsg = "한자리 자연수를 입력하세요.";
		do {
			System.out.print("입력 : ");
			input = sc.next();
			
					
			if (input.length()==1 && input.charAt(0)>'0' && input.charAt(0)<='9') {
				isOne = true;}
			else {System.out.println(errMsg);
				
			}
		}
		while(!isOne);
		System.out.println("끝.");
		
		
	}
}
