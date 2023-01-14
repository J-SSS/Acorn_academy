package ch01.quiz.quiz03;

import java.util.ArrayList;



class Bag{
	
}

class Pencil extends Bag {
	public void write() {
		System.out.println("쓴다!");
	}
}

class Eraser extends Bag {
	public void erase() {
		System.out.println("지운다!");
	}
}


public class Test {
	public static void main(String[] args) {
		
		Bag bPencil = new Pencil();
		Bag bEraser = new Eraser();
		
		ArrayList<Bag> list = new ArrayList<>();
		
		list.add(bEraser);
		list.add(bPencil);
		
		Test test = new Test();
		test.down(list);
	}

void down(ArrayList<Bag> list) {
	for(Bag bag : list) {
		if(bag instanceof Pencil) { 
			Pencil pencil = (Pencil) bag;
			pencil.write();
		}
		else if(bag instanceof Eraser) {
			Eraser eraser = (Eraser) bag;
			eraser.erase();
		}
		
	}
}
}

