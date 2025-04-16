package manajemen.membership.gym.entity;

public class PremiumMember extends Member {
    private String fasilitas;

    public PremiumMember(String id, String nama, String umur, String noTelp, String fasilitas) {
        super(id, nama, umur, noTelp);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    @Override
    public String infoMember() {
        return super.infoMember() + " | Jenis: Premium | Fasilitas: " + fasilitas;
    }
}
