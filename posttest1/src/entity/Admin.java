package entity;
public class Admin {
    private int id;
    private String nama;
    private String email;
    private String noTelp;

    public Admin(){}

    public Admin(int id, String nama, String email, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
    }
    public int getId() {
        return id;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String telp) {
        this.noTelp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
