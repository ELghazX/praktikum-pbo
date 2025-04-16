package manajemen.membership.gym.view;

import manajemen.membership.gym.service.MemberService;
import manajemen.membership.gym.util.InputUtil;

public class MemberView {
    private MemberService service;

    public MemberView(MemberService service) {
        this.service = service;
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Semua Member");
            System.out.println("3. Hapus Member");
            System.out.println("0. Keluar");

            int pilih = InputUtil.inputInt("Pilih");
            switch (pilih) {
                case 1 -> showTambahMenu();
                case 2 -> showAll();
                case 3 -> {
                    String id = InputUtil.input("Masukkan ID Member");
                    if (service.deleteMember(id)) {
                        System.out.println("Berhasil dihapus.");
                    } else {
                        System.out.println("ID tidak ditemukan.");
                    }
                }
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }

    private void showTambahMenu() {
        System.out.println("Pilih Jenis Member:");
        System.out.println("1. Reguler");
        System.out.println("2. Premium");
        System.out.println("3. Student");

        int pilih = InputUtil.inputInt("Pilih");
        String id = InputUtil.input("ID");
        String nama = InputUtil.input("Nama");
        String umur = InputUtil.input("Umur");
        String noTelp = InputUtil.input("No Telp");

        switch (pilih) {
            case 1 -> service.registerRegulerMember(id, nama, umur, noTelp);
            case 2 -> {
                String fasilitas = InputUtil.input("Fasilitas");
                service.registerPremiumMember(id, nama, umur, noTelp, fasilitas);
            }
            case 3 -> {
                String asalKampus = InputUtil.input("Asal Kampus");
                service.registerStudentMember(id, nama, umur, noTelp, asalKampus);
            }
            default -> System.out.println("Jenis tidak valid");
        }
    }

    private void showAll() {
        System.out.println("== Daftar Member ==");
        for (var m : service.getAllMembers()) {
            System.out.println(m.infoMember());
        }
    }
}

