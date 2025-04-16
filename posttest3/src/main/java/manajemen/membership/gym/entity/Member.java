package manajemen.membership.gym.entity;

public class Member {
    protected String id;
    protected String nama;
    protected String umur;
    protected String noTelp;

    public Member() {
    }

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

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String infoMember() {
        return id + " | " + nama + " | " + umur + " | " + noTelp;
    }
}
