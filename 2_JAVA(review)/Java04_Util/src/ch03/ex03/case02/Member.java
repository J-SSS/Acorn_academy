package ch03.ex03.case02;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId)
				return true;
			else return false;
		}		
		return false;
	}	

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public String toString() {
		return String.format("%s 회원님의 아이디는 %d입니다.", memberName, memberId);
	}
}
