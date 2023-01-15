package ch03.ex01.case03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest03 {
	public static void main(String[] args) {
		
		int[] ints = {1,2,3,4,5};
		
		int sum = Arrays.stream(ints).sum();	  // 객체1(IntStream 타입)
		long count = Arrays.stream(ints).count(); // 객체2(IntStream 타입)
		
		System.out.println(sum);
		System.out.println(count);
	}
}
