package manajemen.membership.gym.service;

import manajemen.membership.gym.entity.Member;
import manajemen.membership.gym.repository.MemberRepository;

import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void tambahMember(Member member) {
        memberRepository.tambahMember(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.getAllMembers();
    }

    public Member getMemberByIndex(int index) {
        return memberRepository.getMemberByIndex(index);
    }

    public boolean hapusMember(int index) {
        return memberRepository.hapusMember(index);
    }

    public boolean updateMember(int index, Member memberBaru) {
        return memberRepository.updateMember(index, memberBaru);
    }

    public int jumlahMember() {
        return memberRepository.jumlahMember();
    }
}
