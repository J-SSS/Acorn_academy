package ch04.ex04.quiz;

public class Quiz04 {
	public static void main(String[] args) {
		
		int amount  = 30_000;
		int expense = 0; // 회당 꺼낸 금액
		int cnt = 0;	 // 꺼낸 횟수
		int sum = 0;	 // 꺼낸 금액의 합
		
		while (sum < amount) {
			cnt++;
			expense = (int)(Math.random() * 10 + 1) * 1000;
			System.out.printf("%d번째 %d원\n", cnt, expense);
			sum += expense; // sum = sum + expense
		}
		
		System.out.printf("지갑에서 %d번에 걸쳐 총 %d원을 꺼냈습니다.", cnt, sum);
	}
}

/*
	Math.random()							0.0xx ~ 0.99x
	Math.random() * 10						0.0xx ~ 9.xxx
	Math.random() * 10 + 1					1.xxx ~ 10.xxx
	(int)(Math.random() * 10 + 1)			1 ~ 10
	(int)(Math.random() * 10 + 1) * 1000	1000 ~ 10000
*/