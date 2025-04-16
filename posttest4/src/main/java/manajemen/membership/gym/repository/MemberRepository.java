package manajemen.membership.gym.repository;

import manajemen.membership.gym.entity.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final List<Member> memberList = new ArrayList<>();

    public void tambahMember(Member member) {
        memberList.add(member);
    }

    public List<Member> getAllMembers() {
        return memberList;
    }

    public Member getMemberByIndex(int index) {
        if (index >= 0 && index < memberList.size()) {
            return memberList.get(index);
        }
        return null;
    }

    public boolean hapusMember(int index) {
        if (index >= 0 && index < memberList.size()) {
            memberList.remove(index);
            return true;
        }
        return false;
    }

    public boolean updateMember(int index, Member memberBaru) {
        if (index >= 0 && index < memberList.size()) {
            memberList.set(index, memberBaru);
            return true;
        }
        return false;
    }

    public int jumlahMember() {
        return memberList.size();
    }
}
