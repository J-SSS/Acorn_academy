package ch05.ex01;

public class C06Array {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total =0;
		for (int i=0; i<10; i++) { // i<10을 통해서 10개라는 걸 알 수 있음
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for (int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		
		// Enhanced For문 : forEach문_자루구조 알고리즘
		for (int num : arr) {
			total += num;
		}
		
	}
}
