package manajemen.membership.gym.entity;

public class Riwayat {
    private int id;
    private String tanggal;
    private String waktuMasuk;
    private String waktuKeluar;
    private String aktivitas;

    public Riwayat() {
    }

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

    public String getWaktuMasuk() {
        return waktuMasuk;
    }

    public String getWaktuKeluar() {
        return waktuKeluar;
    }

    public String getAktivitas() {
        return aktivitas;
    }
}
