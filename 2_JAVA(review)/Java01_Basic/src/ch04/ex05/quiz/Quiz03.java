package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		int tries = 0;
		int target = (int)(Math.random() * 100) + 1;
		
//		System.out.println(target);
		
		do {
			System.out.print("입력: ");
			guess = sc.nextInt();
			tries++;
			
			if (guess > target)
				System.out.println("더 큰 수를 말했군요.");
			else if (guess < target)
				System.out.println("더 작은 수를 말했군요.");
		} while(guess != target);
		
		System.out.printf("%d번만에 %d를 맞혔습니다.", tries, target);
	}
}
