package ch03.ex02.case01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		
		ArrayList<String> list =  new ArrayList<>();
		list.add("Arnie");
		list.add("Jake");
		list.add("Dongil");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		//중간연산_최종연산
		list.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		list.stream().map(s -> s.length()).forEach(s -> System.out.print(s + "\t"));;
		System.out.println();
		list.stream().filter(f -> f.length()>=5).forEach(s -> System.out.print(s + "\t"));
	}
}
