package ch01.ex01.case02;

import java.util.Scanner;

public class Circle {
	// 멤버 변수_필드 - 객체의 속성(해당 데이터를 담음)
	int radius;
	String name;
	
	// 멤버 함수_메소드 - 객체의 기능
	double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}
}
