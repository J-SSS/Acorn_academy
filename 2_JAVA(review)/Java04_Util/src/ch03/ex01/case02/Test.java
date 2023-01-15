package ch03.ex01.case02;

public class Test {
	public static void main(String[] args) {
		
		MemberArrayList list = new MemberArrayList();
		
		Member m1 = new Member(1, "m1");
		Member m2 = new Member(2, "m2");
		Member m3 = new Member(3, "m3");
		
		list.addMember(m1);
		list.addMember(m2);
		list.addMember(m3);
		
		list.showAllMember();
		
		list.removeMember(m2.getMemberId());
		list.showAllMember();
	}
}
