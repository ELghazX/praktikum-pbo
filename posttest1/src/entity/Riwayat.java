package entity;

public class Riwayat {
    int id;
    private String tanggal;
    private String waktuMasuk;
    private String waktuKeluar;

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
