package manajemen.membership.gym.entity;

public class Fasilitas {
    private String id;
    private String nama;
    private String jenis;
    private String Deskripsi;
    private String statusKetersediaan;

    public Fasilitas() {
    }

    public Fasilitas(String id, String nama, String jenis, String deskripsi, String statusKetersediaan) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        Deskripsi = deskripsi;
        this.statusKetersediaan = statusKetersediaan;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }
}
