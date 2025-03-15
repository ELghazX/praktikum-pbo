package repository;
import entity.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> members = new ArrayList<>();
    public void addMember(Member member) {
        members.add(member);
    }
    public List<Member> getAllMembers(){
        return members;
    }
    public Member findById(String id) {
        for (Member member: members){
            if (member.getId().equals(id)){
                return  member;
            }
        }
        return null;
    }

    public boolean updateMember(String id, String newNama, String newUmur, String newNoTelp){
        Member member = findById(id);
        if (member != null){
            members.remove(member);
            members.add(new Member(id, newNama, newUmur, newNoTelp));
            return true;
        }
        return false;
    }
    public boolean deleteMember(String id){
        Member member = findById(id);
        if(member!=null){
            members.remove(member);
            return true;
        }
        return false;
    }
}
