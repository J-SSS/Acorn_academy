package ch04.ex04.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		// 1 ~ 100까지의 합 구하기
		int sum = 0;		
		for (int i=1; i<=100; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while (i<101) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}	
}
