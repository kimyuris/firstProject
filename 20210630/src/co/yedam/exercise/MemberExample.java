package co.yedam.exercise;

import pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberId(101);
		m1.setMemberName("Park");
		m1.setMemberPhone("010");
		System.out.println(m1.getMemberId() + "," + m1.getMemberName());
		Member m2 = new Member(101, "Hwang", "01012345678");
		System.out.println(m2.getMemberId());
		Member m3 = new Member(101, "Hwang", "01012345");
		System.out.println(m3.getMemberId() + "," + m3.getMemberName());

		Member[] members = new Member[5];
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		members[3] = null;
		members[4] = null;

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println(members[i].getMemberId() + "," + members[i].getMemberName()+","+members[i].getMemberPhone());
			}
		}

	}
}