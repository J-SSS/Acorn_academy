package ch03.ex01.case02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest02 {
	public static void main(String[] args) {
		
		int[] ints = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(ints); // IntStream 객체 생성
		is.forEach(i->System.out.println(i));
		
//		int sum = is.sum();
		
		int sum = Arrays.stream(ints).sum();		
		System.out.println(sum);
	}
}