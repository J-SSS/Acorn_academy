package ch02.ex02.case03;

public class Baker {
	
	public Bread bake() {
		return new Bread();
	}
	
	public void putPrice(Bread bread, int price) {
		bread.setPrice(price);
	}
}
