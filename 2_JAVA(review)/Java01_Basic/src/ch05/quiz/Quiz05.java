package ch05.quiz;

public class Quiz05 {
	public static void main(String[] args) {
		
		int[] scores = {79, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];
		int min = scores[0];
		
		for (int score : scores) {
			if (score > max) max = score;
			if (score < min) min = score;
		}
		
		System.out.printf("최대값: %d, 최소값: %d", max, min);
	}
}
