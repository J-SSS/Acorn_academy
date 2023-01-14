package ch02.ex01.case05;

public class MyNotebook extends Notebook {

	@Override  //=> 부모 추상클라스인 Notebook에서 구현하지 않고 넘겨도 상속받으려면 결국 구현해야함
	void getOnline() {
		System.out.println("개인 노트북으로 인터넷에 접속합니다.");
		// TODO Auto-generated method stub
		
	}
	
	void DoWebcam() {
		System.out.println("웹캠으로 회의에 참여합니다.");
	}

}
