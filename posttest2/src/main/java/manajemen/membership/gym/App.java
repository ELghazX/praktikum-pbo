package manajemen.membership.gym;

import manajemen.membership.gym.repository.MemberRepository;
import manajemen.membership.gym.service.MemberService;
import manajemen.membership.gym.view.MemberView;

public class App {

    public static void main(String[] args) {

        MemberRepository memberRepo = new MemberRepository();
        MemberService memberService = new MemberService(memberRepo);
        MemberView memberView = new MemberView(memberService);

        memberView.showMainMenu();
    }
}
