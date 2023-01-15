package ch03.ex02.case02;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance(); // new Singleton();
		s1.count(); // 1 2 3
		
		Singleton s2 = Singleton.getInstance(); // s1
		s2.count(); // 2 3
		
		Singleton s3 = Singleton.getInstance(); // s2(s1)
		s3.count();	// 3	
		
		System.out.println(s3.getCount()); // 3 
		System.out.println(s1.getCount()); // 3   
	}
}


