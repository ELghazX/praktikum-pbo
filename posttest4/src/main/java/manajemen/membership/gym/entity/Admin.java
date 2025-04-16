package manajemen.membership.gym.entity;

public class Admin extends User {
    private String role;

    public Admin(String username, String email, String role) {
        super(username, email);
        this.role = role;
    }

    @Override
    public void infoUser() {
        super.infoUser();
        System.out.println("Role: " + role);
    }
}
