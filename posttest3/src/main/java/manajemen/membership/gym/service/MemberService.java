package manajemen.membership.gym.service;

import manajemen.membership.gym.entity.Member;
import manajemen.membership.gym.repository.MemberRepository;
import java.util.List;

public class MemberService {
    private MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public void registerRegulerMember(String id, String nama, String umur, String noTelp) {
        repository.addMember(new RegulerMember(id, nama, umur, noTelp));
    }

    public void registerPremiumMember(String id, String nama, String umur, String noTelp, String fasilitas) {
        repository.addMember(new PremiumMember(id, nama, umur, noTelp, fasilitas));
    }

    public void registerStudentMember(String id, String nama, String umur, String noTelp, String asalKampus) {
        repository.addMember(new StudentMember(id, nama, umur, noTelp, asalKampus));
    }

    public void registerMember(String id, String nama, String umur, String noTelp) {
        Member newMember = new Member(id, nama, umur, noTelp);
        repository.addMember(newMember);
    }

    public List<Member> getAllMembers() {
        return repository.getAllMembers();
    }

    public boolean updateMember(String id, String newNama, String newUmur, String newNoTelp) {
        return repository.updateMember(id, newNama, newUmur, newNoTelp);
    }

    public boolean deleteMember(String id) {
        return repository.deleteMember(id);
    }
}
