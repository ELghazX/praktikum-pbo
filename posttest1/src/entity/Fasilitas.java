package entity;

public class Fasilitas {
    private int id;
    private String nama;
    private String jenis;
    private String Deskripsi;
    private String statusKetersediaan;

    public Fasilitas(){}
    public Fasilitas(int id, String nama, String jenis, String deskripsi, String statusKetersediaan) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        Deskripsi = deskripsi;
        this.statusKetersediaan = statusKetersediaan;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(String statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
}