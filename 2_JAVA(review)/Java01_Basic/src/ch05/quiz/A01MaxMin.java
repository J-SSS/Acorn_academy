package ch05.quiz;

public class A01MaxMin {
	public static void main(String[] args) {
		
		int[] numbers = {10,55,23,2,79,101,16,82,30,45};
		
		int max = numbers[0];
		int min = numbers[0];
		int maxPos = 0;
		int minPos = 0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxPos = i+1;
			}
			if (numbers[i] < min) {
				 min = numbers[i];
				 minPos = i+1;
			}
		}
		
		System.out.printf("가장 큰 값은 %d이고, 위치는 %d번째입니다.", max, maxPos);
		System.out.printf("가장 작은 값은 %d이고, 위치는 %d번째입니다.", min, minPos);
	}
}
