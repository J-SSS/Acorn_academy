package ch04.ex04.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		int dan = 2;
		int unit = 1;
		
		while (dan<=9) {
			unit = 1;
			while (unit<=9) {
				System.out.printf("%d * %d = %d\n", dan, unit, dan*unit);
				unit++;
			}
			dan++;
			System.out.println();
		}
	}
}
