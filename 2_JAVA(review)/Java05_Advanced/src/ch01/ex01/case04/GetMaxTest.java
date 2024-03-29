package ch01.ex01.case04;

public class GetMaxTest {
	public static void main(String[] args) {
		
		GetMax max = (x, y) -> {
			if (x > y) return x;
			else return y;
		};		
		System.out.println(max.getMax(-100, 100));
		
		GetMax max2 = (x, y) -> (x>y) ? x : y;
		System.out.println(max2.getMax(200, 0));
	}
}