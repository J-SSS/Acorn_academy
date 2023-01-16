package ch02.ex02_Generic.case03;

public class GenericPrinter<T extends Ink> {
	
	private T ink;
	
	public T getInk() {
		return ink;
	}
	
	public void setInk(T ink) {
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return ink.toString();
	}
}
