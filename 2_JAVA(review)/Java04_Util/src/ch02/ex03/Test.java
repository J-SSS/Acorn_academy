package ch02.ex03;

public class Test {
	public static void main(String[] args) {
		
		MyArrayList<String> mList = new MyArrayList<>();
		mList.add("강남");
		mList.add("싸이");
		mList.insert(1, "삽입1");
//		mList.clear();
		mList.remove(1);
		mList.remove("강남");
		
		for (int i=0; i<mList.size(); i++) {
			System.out.println(mList.get(i));
		}
		
		System.out.println(mList.isEmpty());
		System.out.println(mList.indexOf("싸이"));
		System.out.println(mList.contains("이"));
	}
}
