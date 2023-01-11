package ch03.quiz;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer("동일", 10));
		list.add(new Customer("동이", 15));
		list.add(new Customer("동삼", 20));
		list.add(new Customer("동사", 7));
		list.add(new Customer("동오", 25));
		list.add(new Customer("동육", 29));
		Stream<Customer> stream = list.stream();
		
		System.out.println("=== 고객 명단 출력(들어간 순)==");
		stream.forEach(s -> System.out.print(s.name + "\n"));
		System.out.println();
		
		System.out.println("=== 총 여행 비용 출력 ===");
		long countY = list.stream().filter(f -> f.age>=15).count();
		long countO = list.stream().filter(f -> f.age>=15).count();
		System.out.println(countY*50 + countO*100 + "만원");
		System.out.println();
		
		System.out.println("=== 고객 명단 출력(15세 이상_정렬)");
		list.stream().filter(f -> f.age>=15).forEach(s -> System.out.print(s.name + "\n"));
		
	}
}
