package manajemen.membership.gym.entity;

public class StudentMember extends Member {
    private String asalKampus;

    public StudentMember(String id, String nama, String umur, String noTelp, String asalKampus) {
        super(id, nama, umur, noTelp);
        this.asalKampus = asalKampus;
    }

    public String getAsalKampus() {
        return asalKampus;
    }

    @Override
    public String infoMember() {
        return super.infoMember() + " | Jenis: Student | Kampus: " + asalKampus;
    }
}
