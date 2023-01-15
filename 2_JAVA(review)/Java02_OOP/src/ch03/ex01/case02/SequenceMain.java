package ch03.ex01.case02;

public class SequenceMain {
	public static void main(String[] args) {
		
		Sequence.setBasisNum(0);
		
		Sequence s1 = new Sequence();
		Sequence s2 = new Sequence();
		Sequence s3 = new Sequence();
		
		System.out.println(s1.nextNum()); // 0
		System.out.println(s2.nextNum()); // 1
		System.out.println(s3.nextNum()); // 2
		
		System.out.println();
		
		Sequence.setBasisNum(10);
		System.out.println(s1.nextNum()); // 10
		System.out.println(s2.nextNum()); // 11
		System.out.println(s3.nextNum()); // 12
	}
}
