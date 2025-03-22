package manajemen.membership.gym.entity;

public class Pembayaran {
    private String tanggal;
    private String jumlah;
    private String metode;
    private String status;
    private String idMember;

    public Pembayaran() {
    }

    public Pembayaran(int idMember, String tanggal, String jumlah, String metode, String status) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.metode = metode;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJumlah() {
        return jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public String getStatus() {
        return status;
    }

    public String getIdMember() {
        return idMember;
    }
}
