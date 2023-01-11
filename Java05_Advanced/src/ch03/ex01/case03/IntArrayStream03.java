package ch03.ex01.case03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStream03 {


	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
		
		int sum = Arrays.stream(ints).sum(); //객체1(intstream)
		long count = Arrays.stream(ints).count(); //객체2(intstream)
		
		System.out.println(count); 
	}
	

}
