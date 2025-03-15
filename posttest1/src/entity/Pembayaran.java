package entity;

public class Pembayaran {
    private int id;
    private String tanggal;
    private String jumlah;
    private String metode;
    private String status;

    public Pembayaran(){}
    public Pembayaran(int id, String tanggal, String jumlah, String metode, String status) {
        this.id = id;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.metode = metode;
        this.status = status;
    }

    public int getId() {
        return id;
    }

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