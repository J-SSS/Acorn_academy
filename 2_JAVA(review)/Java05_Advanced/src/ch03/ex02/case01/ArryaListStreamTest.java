package ch03.ex02.case01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArryaListStreamTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Arnie");
		list.add("Pancho");
		list.add("Jake");
		
		Stream<String> stream = list.stream();
		stream.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		// 중간 연산_최종 연산
		list.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		list.stream().map(m->m.length()).forEach(s->System.out.print(s + "\t"));
		System.out.println();
		list.stream().filter(f->f.length()>=5).forEach(s->System.out.print(s + "\t"));
	}
}
