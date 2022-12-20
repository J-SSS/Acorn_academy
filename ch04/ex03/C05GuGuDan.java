package ch04.ex03;

public class C05GuGuDan {
	public static void main(String[] args) {
	
		int dan = 2;
		int unit = 1;
		for (; dan<=9 ; dan++) {
			for(unit = 1 ;unit<=9;unit++) {
				System.out.println(dan + "x" + unit );
			}
			System.out.println();
		}
}
}
