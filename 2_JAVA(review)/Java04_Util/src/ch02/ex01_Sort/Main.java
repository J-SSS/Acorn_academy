package ch02.ex01_Sort;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = {1,2,0,3,10,9,4,-1};
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int[] arr2 = {1,2,0,3,10,9,4,-1};
		
		InsertionSort is = new InsertionSort();
		is.sort(arr2);
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}