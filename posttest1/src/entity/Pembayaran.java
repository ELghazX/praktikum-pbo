package entity;

public class Pembayaran {
    int id;
    private String tanggal;
    private String jumlah;
    private String metode;
    private String status;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
