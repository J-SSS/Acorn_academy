package ch04.ex03.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		for (int i=1; i<101; i++) {
			if (i%5 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for (int i=5; i<101; i=i+5) {
			System.out.print(i + " ");
		}
	}
}
