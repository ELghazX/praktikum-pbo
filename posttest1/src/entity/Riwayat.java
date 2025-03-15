package entity;

public class Riwayat {
    private int id;
    private String tanggal;
    private String waktuMasuk;
    private String waktuKeluar;

    public Riwayat(){}
    public Riwayat(int id, String tanggal, String waktuMasuk, String waktuKeluar) {
        this.id = id;
        this.tanggal = tanggal;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
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

    public String getWaktuMasuk() {
        return waktuMasuk;
    }

    public void setWaktuMasuk(String waktuMasuk) {
        this.waktuMasuk = waktuMasuk;
    }

    public String getWaktuKeluar() {
        return waktuKeluar;
    }

    public void setWaktuKeluar(String waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }
}
