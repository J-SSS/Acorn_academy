package ch02.ex01.sub.case02;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// ArrayList 사용 - 추가, 수정, 삭제, 조회
		// ArrayList 객체 생성 <제네릭 사용>
		ArrayList<String> s = new ArrayList<String>();
		
		// 추가 - add()
		s.add("김석영"); // [0]
		s.add("김수현"); // [1]
		s.add("최민식"); // [2]
		
		// 조회 - get()
		System.out.println(s.get(0)); // 김석영
		System.out.println(s.get(1)); // 김수현
		System.out.println(s.get(2)); // 최민식
		
		// 수정 - set(인덱스, 수정값)
		s.set(1, "리사");
		System.out.println(s.get(1)); // 리사
		System.out.println("---------------------");
		
		// 조회1
		for (int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("---------------------");
		
		// 삭제1 - remove(인덱스)
		s.remove(2); // 최민식
		
		// 조회2
		for (String p : s) {
			System.out.println(p);
		}
		System.out.println("---------------------");
		
		// 삭제2 - removeAll(인스턴스명): 한꺼번에 삭제
		s.removeAll(s);
		System.out.println(s.size()); // 0
		System.out.println("---------------------");
		
		for (String p : s) {
			System.out.println(p);
		}
		System.out.println("---------------------");
	}
}
