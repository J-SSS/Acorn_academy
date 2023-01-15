package ch04.ex05;

public class C04Break {
	public static void main(String[] args) {
		
		// 1부터 순차적으로 숫자를 더하여 100이 넘기 직전의 그 숫자와 누적된 합을 출력
		int sum=0;
		int num;
		
		for (num=1; sum<=100; num++) {
			sum += num; // sum = sum + num
		}
		
		System.out.println(sum); // 105  1+2+3+ ... +14
		System.out.println(num); // 15
		
		sum=0;
		for (num=1; ; num++) {
			sum += num; // sum = sum + num
			if (sum >= 100) break;
		}
		
		System.out.println(sum); // 105
		System.out.println(num); // 14		
	}
}
