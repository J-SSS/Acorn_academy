package ch01.ex05.quiz;

public class Circle {
	
	private Point point;  // Circle has a Point
	private int radius;
	
	public Circle(Point point, int radius) {
		this.point = point;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", point, radius);
	}
}
