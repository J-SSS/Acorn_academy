package ch04.ex02.case01;

public class ArrayExceptionHandling02 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("에러 발생");
		}

	}
}
