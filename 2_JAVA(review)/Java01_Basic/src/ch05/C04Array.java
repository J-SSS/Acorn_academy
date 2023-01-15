package ch05;

public class C04Array {
	public static void main(String[] args) {
		
		int[] ints;
		ints = new int[100];
		
		double[] doubles = new double[100]; // 방 개수(100개) 방 번호(0 ~ 99)  doubles[100]은 존재 X
		
		String strings[] = new String[100];
		
		boolean[] bools = new boolean[100];
		
		System.out.println(ints[99]);	 // 0 (기본값)
		System.out.println(doubles[0]);  // 0.0
		System.out.println(strings[50]); // null (객체가 비어있다. 비어있는 값)
		System.out.println(bools[0]);	 // false
//		System.out.println(bools[100]);  // ERROR
	}
}
