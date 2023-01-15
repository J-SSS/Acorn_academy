package ch04.ex05.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		int num;
		for (num=1; num<=1000; num++) {
			if (num%5 != 0) continue;
			System.out.println(num);
		}
	}
}
