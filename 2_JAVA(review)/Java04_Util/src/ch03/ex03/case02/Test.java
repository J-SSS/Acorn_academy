package ch03.ex03.case02;

public class Test {
	public static void main(String[] args) {
		
		MemberHashMap list = new MemberHashMap();
		
		Member m1 = new Member(1, "m1");
		Member m2 = new Member(2, "m2");
		Member m3 = new Member(3, "m3");
		Member m4 = new Member(4, "m4");
		
		list.addMember(m1);
		list.addMember(m2);
		list.addMember(m3);
		list.addMember(m4);
		
		list.showAllMember();
		
		list.removeMember(3);
		list.showAllMember();
	}
}
