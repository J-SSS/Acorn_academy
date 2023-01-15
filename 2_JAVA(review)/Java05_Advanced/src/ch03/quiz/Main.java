package ch03.quiz;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("새로이", 40, 100);
		Customer c2 = new Customer("이서", 20, 100);
		Customer c3 = new Customer("근수", 12, 50);
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(c3);
		list.add(c2);
		list.add(c1);
		
		System.out.println("--- 고객 명단 출력(들어간 순) --");
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("--- 총 여행 비용 출력 ---");
		int total = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total + "만 원");
		System.out.println();
		
		System.out.println("--- 고객 명단 출력(15세 이상_정렬) ---");
		list.stream().filter(c->c.getAge() >= 15)
			.map(c->c.getName()).sorted().forEach(c->System.out.println(c));
	}
}
