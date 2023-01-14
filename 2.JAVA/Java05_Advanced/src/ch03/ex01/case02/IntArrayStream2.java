package ch03.ex01.case02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStream2 {
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(ints); //IntStream 객체 생성
		is.forEach(i -> System.out.print(i));
		System.out.println();
//		int sum = is.sum();
//		System.out.println(sum); // stream has already been operated
		
		int sum = Arrays.stream(ints).sum();
		
		System.out.println(sum); 
	}

	//한 번 생성하고 사용한 스트림은 재사용할 수 없음
	//(다른 연산을 위해서는 재생성 필요)
}
