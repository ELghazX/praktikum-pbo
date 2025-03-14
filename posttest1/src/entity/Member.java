package entity;

public class Member {
    int id;
    private String nama;
    private String email;
    private String telp;
    private String status;
    private String tanggalBergabung;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggalBergabung() {
        return tanggalBergabung;
    }

    public void setTanggalBergabung(String tanggalBergabung) {
        this.tanggalBergabung = tanggalBergabung;
    }
}
