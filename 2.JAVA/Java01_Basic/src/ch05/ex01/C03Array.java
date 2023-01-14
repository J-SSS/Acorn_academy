package ch05.ex01;

public class C03Array {
	public static void main(String[] args) {
		
		int[] ints;
		ints = new int[100];
		
		double[] doubles = new double[100];
		
		String[] strings = new String[100];
		
		System.out.println(ints[99]); //0
		System.out.println(doubles[0]); //0.0
		System.out.println(strings[50]); //null : 
		
	}
}
