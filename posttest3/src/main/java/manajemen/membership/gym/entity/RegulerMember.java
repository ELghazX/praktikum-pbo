package manajemen.membership.gym.entity;

public class RegulerMember extends Member {
    public RegulerMember(String id, String nama, String umur, String noTelp) {
        super(id, nama, umur, noTelp);
    }

    @Override
    public String infoMember() {
        return super.infoMember() + " | Jenis: Reguler";
    }
}
