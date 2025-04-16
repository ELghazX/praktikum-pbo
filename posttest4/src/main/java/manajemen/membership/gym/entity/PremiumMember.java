package manajemen.membership.gym.entity;

public class PremiumMember extends Member {
    public PremiumMember(String username, String email) {
        super(username, email);
    }

    @Override
    public void infoUser() {
        super.infoUser();
        System.out.println("Keanggotaan: Premium");
    }
}
