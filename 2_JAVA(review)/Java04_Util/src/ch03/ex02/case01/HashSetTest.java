package ch03.ex02.case01;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add(new String("m1"));
		hs.add(new String("m2"));
		hs.add(new String("m3"));
		hs.add(new String("m4")); // 이 둘은 서로 다른 instance (사실은 주소가 다르다.)
		hs.add(new String("m4")); // 그렇지만 String 클래스에서 입력값이 같으면 같게 인식되도록 오버라이딩됐있음 (equals 메소드)
		hs.add("abc");
		
		System.out.println(hs);
		System.out.println("Set => 중복을 허용 X. 데이터의 저장 순서가 정해져있지 않다.");
		
		hs.remove(new String("m4"));
		hs.remove("abc");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
	}
}
