package ch03.sub;

public class SnackVM extends VM implements Software {

	@Override
	public void insert(String snackName) {
		vm.add(snackName);
	}

	@Override
	public String takeOut() {
		return vm.remove(0);
	}

	@Override
	public int getCount() {
		return getNumber();
	}
}
