package ch04.ex02.case01;

public class ArrayExceptionHandling02 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for (int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("비정상 종료되지 않았습니다.");
	}
}
