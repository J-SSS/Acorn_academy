package ch02.ex01.case05;

public class Main {
	public static void main(String[] args) {
		
		//Computer computer = new Computer()  => 추상클래스이므로 생성 불가
		
		Computer desktop = new Desktop(); //추상클래스로 업캐스팅도 가능함
		desktop.show(); // Computer를 거쳐 Desktop에서 Overriding 된 메소드를 불러옴
			
		System.out.println();
		
		//Notebook nb = new Notebook() => 추상클래스이므로 생성 불가
			
		Computer myNB =  new MyNotebook(); //업캐스팅
		myNB.getOnline(); // Computer를 거쳐 MyNotebook에서 Overriding 된 메소드를 불러옴
		myNB.show();
		//myNB.DoWebcam은 업캐스팅을 거쳐서는 불러올 수 없음. MyNotebook가진 고유한 메소드이므로.
		
		MyNotebook myNote = (MyNotebook)myNB; // 다운캐스팅!
		myNote.DoWebcam(); //다운캐스팅 했으니까 불러올 수 있음ㅋㅋ
	}
}
