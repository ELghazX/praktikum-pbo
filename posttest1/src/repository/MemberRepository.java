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
}
