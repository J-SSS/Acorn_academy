package ch02.ex02.case03;

public class YellowInk extends Ink {
	
	@Override
	public String toString() {
		return "노랑색 잉크입니다.";
	}

	@Override
	void doPrinting() {
		System.out.println("노랑색 잉크로 출력합니다.");
	}
}
