package ch04.ex03.quiz;

public class Quiz08 {
	public static void main(String[] args) {
		
		for (int i=5; i>0; i--) {
			for (int j=1; j<6; j++) {
				System.out.printf("[%d0%d]", i, j);
			}
			System.out.println();
		}
	}
}
