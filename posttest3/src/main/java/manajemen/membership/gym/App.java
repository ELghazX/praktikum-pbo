package manajemen.membership.gym;

import manajemen.membership.gym.repository.MemberRepository;
import manajemen.membership.gym.service.MemberService;
import manajemen.membership.gym.view.MemberView;

public class App {
    public static void main(String[] args) {
        MemberRepository repo = new MemberRepository();
        MemberService service = new MemberService(repo);
        MemberView view = new MemberView(service);
        view.showMainMenu();
    }
}
