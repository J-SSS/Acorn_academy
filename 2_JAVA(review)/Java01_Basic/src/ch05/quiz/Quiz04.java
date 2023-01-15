package ch05.quiz;

public class Quiz04 {
	public static void main(String[] args) {
		
		int sum=0;
		double avg=0.0;
		
		int[] scores = {100, 50, 100, 50};
		
		for (int score : scores)
			sum += score; // sum = sum + score
		
		avg = 1.0 * sum / scores.length;
		
		System.out.printf("합계: %d, 평균: %.1f", sum, avg);
	}
}
