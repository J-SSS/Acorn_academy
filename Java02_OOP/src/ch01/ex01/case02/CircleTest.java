package ch01.ex01.case02;

public class CircleTest {
	public static void main(String[] args) {
		// 객체 생성
		Circle mirror;
		mirror = new Circle();
		
		// 객체 활용 - 객체 멤버에 접근(.)
		mirror.radius = 10;
		mirror.name = "손거울";
		double mirrorArea = mirror.getArea();
		
		System.out.printf("%s의 면적은 %.1f입니다.", mirror.name, mirrorArea);
	
		Circle donut = new Circle();
		
		donut.radius = 5;
		donut.name = "도넛츠";
		double donutArea = donut.getArea();
		
		System.out.printf("%s의 면적은 %.1f입니다.", donut.name, donutArea);
	
	}
	
}
