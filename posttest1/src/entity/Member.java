package entity;
public class Member {
    private int id;
    private String nama;
    private String email;
    private String noTelp;

    public Member(int id, String nama, String email, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Email: " + email + ", NoTelp: " + noTelp;
    }
}