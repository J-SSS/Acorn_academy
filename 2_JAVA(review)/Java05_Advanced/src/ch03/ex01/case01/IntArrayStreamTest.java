package ch03.ex01.case01;

import java.util.Arrays;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		
		int[] ints = {1,2,3,4,5};
		
		for (int num : ints)
			System.out.print(num + " ");
		
		System.out.println();
		
		Arrays.stream(ints).forEach(n -> System.out.print(n + " "));
		
	}	
}
