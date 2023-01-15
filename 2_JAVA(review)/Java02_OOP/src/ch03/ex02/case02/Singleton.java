package ch03.ex02.case02;

public class Singleton {
	// 필드
	private static Singleton instance = null;
	private int count = 0;
	
	// 생성자
	private Singleton() {}
	
	// 메소드
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
			return instance;
		}		
		return instance;
	}
	
	public void count() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
