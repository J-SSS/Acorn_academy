package ch02.ex01_print.quiz;

public class Quiz03 {
	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 90;
		int math = 98;
		
		int sum = kor + eng + math;
		double avg = sum / 3.0; // int / double -> double/double
		
		System.out.println("총점: " + sum + "\n평균: " + avg);
		System.out.printf("총점: %d, 평균: %.2f", sum, avg);
	}
}
