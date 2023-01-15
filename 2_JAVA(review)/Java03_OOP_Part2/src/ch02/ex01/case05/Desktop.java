package ch02.ex01.case05;

public class Desktop extends Computer {

	@Override
	void show() {
		System.out.println("사무용 컴퓨터 화면에서 동영상이 보여집니다.");
	}

	@Override
	void getOnline() {
		System.out.println("사무용 컴퓨터에서 인터넷에 접속합니다.");
	}
}
