package manajemen.membership.gym.entity;

public class StudentMember extends Member {
    private String institusi;

    public StudentMember(String username, String email, String institusi) {
        super(username, email);
        this.institusi = institusi;
    }

    @Override
    public void infoUser() {
        super.infoUser();
        System.out.println("Keanggotaan: Student");
        System.out.println("Asal Institusi: " + institusi);
    }
}
