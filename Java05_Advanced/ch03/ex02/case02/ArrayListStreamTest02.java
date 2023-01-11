package ch03.ex02.case02;

import java.util.ArrayList;

public class ArrayListStreamTest02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum = list.stream().mapToInt(m -> m.intValue()).sum();
		System.out.println(sum);
	}
}
