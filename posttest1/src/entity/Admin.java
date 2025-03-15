package entity;
public class Admin {
    private String username;
    private String password;

    public Admin(){}
    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public boolean login(String inputPassword){
        return this.password.equals(inputPassword);
    }
}
