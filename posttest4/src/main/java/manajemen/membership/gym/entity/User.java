package manajemen.membership.gym.entity;

public class User {
    protected String username;
    protected String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void infoUser() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    // Polymorphism Overloading
    public void greeting() {
        System.out.println("Halo " + username + ", selamat datang!");
    }

    public void greeting(String customMsg) {
        System.out.println(customMsg);
    }
}
