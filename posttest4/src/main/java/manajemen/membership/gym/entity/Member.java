package manajemen.membership.gym.entity;

public class Member extends User {
    public Member(String username, String email) {
        super(username, email);
    }

    @Override
    public void infoUser() {
        super.infoUser();
        System.out.println("Tipe: Member");
    }
}
