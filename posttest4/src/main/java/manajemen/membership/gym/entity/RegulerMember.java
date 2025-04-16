package manajemen.membership.gym.entity;

public class RegulerMember extends Member {
    public RegulerMember(String username, String email) {
        super(username, email);
    }

    @Override
    public void infoUser() {
        super.infoUser();
        System.out.println("Keanggotaan: Reguler");
    }
}
