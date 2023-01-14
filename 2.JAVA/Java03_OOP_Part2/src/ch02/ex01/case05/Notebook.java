package ch02.ex01.case05;

public abstract class Notebook extends Computer {

	@Override
	void show() {
		System.out.println("노트북 화면에서 동영상이 보여집니다.");
	}

//	@Override
//	void getOnline() {
//		
//	}  //부모 추상클래스에 있는 추상메소드를 구현하지 않으면 에러발생. 강제성ㅇ
	
	// 오버라이딩을 하거나,
	// 자식클래스도 추상클래스로 바꿔주면 해결ㅇ
	
	

}
