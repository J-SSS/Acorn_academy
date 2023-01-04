package ch03.ex01.case03;

public class Desktop implements Computer {

	@Override
	public void getOnline() {
		System.out.println("사무용 컴퓨터로 인터넷에 접속한다");
	}

}
