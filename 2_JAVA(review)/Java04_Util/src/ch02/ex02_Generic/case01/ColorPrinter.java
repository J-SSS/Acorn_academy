package ch02.ex02_Generic.case01;

public class ColorPrinter {
	
	private Yellow ink;
	
	public Yellow getInk() {
		return ink;
	}
	
	public void setInk(Yellow ink) {
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return "잉크의 색은 노랑색입니다.";
	}
}
