package ch05.quiz;

public class Quiz07 {
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.print(numbers[i] + " ");
		}
		
		for (int i=0; i<100; i++) {
			int n = (int)(Math.random() * 5); // 0 ~ 4
			
			int temp = numbers[0];
			numbers[0] = numbers[n];
			numbers[n] = temp;
		}
		System.out.println();
		
		for (int number : numbers)
			System.out.print(number + " ");
	}
}
