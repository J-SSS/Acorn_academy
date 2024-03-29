package ch01.ex03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String"); // 동적 로딩
		
		// reflection 프로그램 (해당 클래스가 local에 없고, remote에 있을 때 사용)
		Constructor[] cons = c.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] ms = c.getMethods();
		for (Method m : ms)
			System.out.println(m);
	}
}

// Class 클래스
// 컴파일 된 class 파일을 로드하여 객체를 동적으로 로드하고, 그 정보를 가져오는 메소드를 제공  
// ex) Class.forName("클래스명");