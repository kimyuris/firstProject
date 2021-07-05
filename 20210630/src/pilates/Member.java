package pilates;

public class Member {
	private int memberId;
	private String memberName;
	private String memberPhone;
	private String memberBirth;
	private Gender memberGen;

	public Member() {
		this.memberId = 100;
		this.memberName = "Hong";
		this.memberPhone = "010";

	}

	public Member(int memberId, String memberName, String memberPhone, String memberBirth, Gender memberGen) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberGen = memberGen;
	}

	public Member(int memberId, String memberName, String memberPhone) {
		// TODO Auto-generated constructor stub
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public Gender getMemberGen() {
		return memberGen;
	}

	public void setMemberGen(Gender memberGen) {
		this.memberGen = memberGen;
	}

	public String showInfo() {
		String info = "회원ID : " + memberId + " 회원이름 : " //
				+ memberName + " 연락처 : " + memberPhone //
				+ " 생년월일 : " + memberBirth + " 성별 : " + memberGen;
		return info;
	}

	public String showDetail() {
		String detail = "=========================" + "\n회원ID : " + memberId + " 회원이름 : " //
				+ memberName + "\n연락처 : " + memberPhone //
				+ "\n생년월일 : " + memberBirth + "성별 : " + memberGen + "\n=========================";
		return detail;

	}

}
