package ch05.ex01.quiz;

public class quz02 {
	public static void main(String[] args) {
		
		///7777777777777
//		
//		int[] numbers = new int[5];
//		
//		for(int i =0; i<numbers.length; i++) {
//			numbers[i] = i;
//			System.out.print(numbers[i] + " ");
//		}
//		
//		for (int i=0; i<100; i++) {
//			int n = (int)(Math.random()*5);
//			
//			int temp = numbers[0];
//			numbers[0] = numbers[n];
//			numbers[n] = temp;
//		}
//		System.out.println();
//		for(int number : numbers){
//			
//		System.out.print(number + " ");
//				
//			};
			
		//88888888888888888888
		
		int p = 8370;
		
		int g = 0;
	
		int[] wal = {500,100,50,10};
		for(int i =0 ; i<wal.length ; i++) {
			
		g = p/wal[i];
		System.out.printf("%d원짜리 동전은 [%d]개가 필요합니다!",wal[i], g);	
			
		p=(p-wal[i]*g);
		System.out.println();
		}
		System.out.println();
		
		//99999999999999999999
		
		int[] arr = {10,55,23,2,79,101,16,82,30,45};
		
		int max = arr[0];
		int min = arr[0];
		int cmax = 1;
		int cmin =1;

		for(int i =0 ; i<arr.length ; i++) {
			if(arr[i]>max) {max = arr[i];
			cmax = i;}
			if(arr[i]<min) {min = arr[i];
			cmin = i;}
		}
			
		System.out.println("가장 큰 값은 [" + max + "]이고, 위치는 [" + (cmax+1) + "]번째입니다.");
		System.out.println("가장 큰 값은 [" + min + "]이고, 위치는 [" + (cmin+1) + "]번째입니다.");
		
		
	}
}
