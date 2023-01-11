package ch01.ex01.case03;

public class AddTest {
	public static void main(String[] args) {
		
		Add add = (int x, int y) -> { return x + y;};
		Add add2 = (x, y) -> x + y;
		add.add(5, 5);
	}
}
