package ch03.ex03.case01;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "m1");
		hm.put(2, "m1");
		hm.put(3, "m1");
		hm.put(4, "m1");
		
		System.out.println(hm);
	}
}