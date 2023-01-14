package ch04.ex02.case01;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception 발생!");
		}
		
		System.out.println("End");
		
	}
}

