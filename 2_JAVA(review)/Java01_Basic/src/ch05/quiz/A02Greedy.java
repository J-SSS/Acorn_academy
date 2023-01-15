package ch05.quiz;

public class A02Greedy {
	public static void main(String[] args) {
		
		int[] coins = {500, 100, 50, 10};
		int price = 8370;
		int count; // 사용된 각 동전의 개수
		
		for (int i=0; i<coins.length; i++) {
			count=0;
			count = price / coins[i];
			price = price % coins[i];
			
			System.out.println(coins[i] + "짜리 동전은 " + count + "개가 필요합니다.");
		}
	}
}

