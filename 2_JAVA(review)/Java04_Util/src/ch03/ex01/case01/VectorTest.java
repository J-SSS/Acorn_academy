package ch03.ex01.case01;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("test1");
		v.add("test2");
		v.addElement("test3");
		System.out.println("v의 크기 => " + v.size());
		
		for (int i=0; i<v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println("s => " + s);
		}
		
		// 다양한 값 저장
		Vector v2 = new Vector<>();
		v2.add('a'); // v2.add(new Character('a'))
		v2.add(100);
		v2.insertElementAt(3.141592, 0);
		
		for (int i=0; i<v2.size(); i++)
			System.out.println("v2의 값 => " + v2.elementAt(i));
	}
}
