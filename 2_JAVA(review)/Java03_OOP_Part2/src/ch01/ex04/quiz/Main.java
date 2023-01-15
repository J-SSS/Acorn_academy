package ch01.ex04.quiz;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Stationery> bag = new ArrayList<>();
		
		bag.add(new Eraser()); // up_casting(자동타입변환)
		bag.add(new Pencil());
		
		for (Stationery s : bag) {
			if (s instanceof Eraser) ((Eraser)s).erase(); // down_casting
			if (s instanceof Pencil) ((Pencil)s).write();
		}
	}
}
