package entity;

public class Member {
    private String id;
    private String nama;
    private String umur;
    private String noTelp;

    public Member() {
    };

    public Member(String id, String nama, String umur, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.noTelp = noTelp;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String umur) {
        this.umur = umur;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String infoMember() {
        return "ID: " + id + "| Nama: " + nama + "| Umur: " + umur + "| NoTelp: " + noTelp;
    }
}
