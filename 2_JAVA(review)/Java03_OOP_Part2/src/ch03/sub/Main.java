package ch03.sub;

public class Main {
	public static void main(String[] args) {
		
		Software snackVM = new SnackVM();
		
		snackVM.insert("치토스");
		snackVM.insert("짱구");
		snackVM.insert("포카칩");
		
		System.out.println(snackVM.getCount());
		
		System.out.println(snackVM.takeOut());
		System.out.println(snackVM.takeOut());
		System.out.println(snackVM.takeOut());
		
		System.out.println(snackVM.getCount());
	}
}
