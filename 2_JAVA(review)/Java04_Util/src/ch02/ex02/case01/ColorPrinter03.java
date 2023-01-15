package ch02.ex02.case01;

public class ColorPrinter03 {

	private Object ink;
	
	public Object getInk() {
		return ink;
	}
	
	public void setInk(Object ink) {
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return ink.toString();
	}
}
