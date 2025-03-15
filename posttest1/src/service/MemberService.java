package service;

import entity.Member;
import repository.MemberRepository;
import java.util.List;

public class MemberService {
    private MemberRepository repository;
    public MemberService(MemberRepository repository){
        this.repository = repository;
    }
    public void registerMember(String id, String nama, String umur, String noTelp){
        Member newMember = new Member(id, nama, umur, noTelp);
        repository.addMember(newMember);
    }
    public List<Member> getAllMembers(){
        return repository.getAllMembers();
    }
    public boolean updateMember(String id, String newNama, String newUmur, String newNoTelp){
        return repository.updateMember(id, newNama, newUmur, newNoTelp);
    }

    public boolean deleteMember(String id){
        return repository.deleteMember(id);
    }
}
