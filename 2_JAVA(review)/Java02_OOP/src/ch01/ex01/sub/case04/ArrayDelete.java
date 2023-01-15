package ch01.ex01.sub.case04;

public class ArrayDelete {
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};  
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");  // 1 2 3 4 5
		}
		System.out.println();
		
		// 배열의 원소 삭제
		for (int i=2; i<a.length-1; i++) {  
			a[i] = a[i+1]; //
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");  // 1 2 4 5 5
		}
		System.out.println();
		
		// 삭제를 반영한 출력
		for (int i=0; i<a.length-1; i++) { // 1 2 4 5
			System.out.print(a[i] + " ");
		}
	}
}
