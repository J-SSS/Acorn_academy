package ch04.ex05;

import java.util.Scanner;

public class C02DoWhile {
	public static void main(String[] args) {
		// 한 글자만 입력할 때까지 반복
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0; // 글자 수
		
		do {
			System.out.print("> ");
			input = sc.nextLine();
			
			len = input.length();
			System.out.println(len + "글자를 입력했습니다.");
		} while (len==0 || len>1); // len==1(한글자) 빠져나옴
		
		System.out.println("끝");
	}
}
