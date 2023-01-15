package ch02.ex01.case05;

public class Main {
	public static void main(String[] args) {
		
//		Computer computer = new Computer();
		Computer desktop = new Desktop(); // up_casting
		desktop.show();
		desktop.getOnline();
		
		System.out.println();
		
//		Notebook nb = new Notebook();
		Computer myNB = new MyNotebook(); // up_casting
		myNB.getOnline(); // 오버라이딩
		myNB.show();	  // 상속(Notebook)
		
		MyNotebook myNote = (MyNotebook) myNB; // down_casting
		myNote.getOnline(); // 오버라이딩
		myNote.show();		// 상속(Notebook)
		myNote.DoWebcam();
	}
}
	