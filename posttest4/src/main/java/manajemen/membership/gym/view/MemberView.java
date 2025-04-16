package manajemen.membership.gym.view;

import manajemen.membership.gym.entity.*;
import manajemen.membership.gym.service.MemberService;
import manajemen.membership.gym.util.InputUtil;

public class MemberView {
    private final MemberService service;

    public MemberView(MemberService service) {
        this.service = service;
    }

    public void menuUtama() {
        while (true) {
            System.out.println("\n=== MENU MEMBER ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Semua Member");
            System.out.println("3. Hapus Member");
            System.out.println("4. Keluar");

            var input = InputUtil.input("Pilih");

            switch (input) {
                case "1" -> tambahMember();
                case "2" -> tampilkanMember();
                case "3" -> hapusMember();
                case "4" -> {
                    System.out.println("Keluar dari menu member.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahMember() {
        System.out.println("\n=== Tambah Member ===");
        String username = InputUtil.input("Username");
        String email = InputUtil.input("Email");

        System.out.println("Pilih tipe member:");
        System.out.println("1. Premium");
        System.out.println("2. Reguler");
        System.out.println("3. Student");
        String pilihan = InputUtil.input("Pilihan");

        Member memberBaru = switch (pilihan) {
            case "1" -> new PremiumMember(username, email);
            case "2" -> new RegulerMember(username, email);
            case "3" -> {
                String institusi = InputUtil.input("Asal Institusi");
                yield new StudentMember(username, email, institusi);
            }
            default -> {
                System.out.println("Pilihan tidak valid. Gagal menambahkan member.");
                yield null;
            }
        };

        if (memberBaru != null) {
            service.tambahMember(memberBaru);
            System.out.println("Member berhasil ditambahkan.");
        }
    }

    private void tampilkanMember() {
        System.out.println("\n=== Daftar Member ===");
        var list = service.getAllMembers();
        if (list.isEmpty()) {
            System.out.println("Belum ada member.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("\n[Member ke-" + (i + 1) + "]");
            list.get(i).infoUser();
        }
    }

    private void hapusMember() {
        tampilkanMember();
        String input = InputUtil.input("Masukkan nomor member yang akan dihapus");
        try {
            int index = Integer.parseInt(input) - 1;
            if (service.hapusMember(index)) {
                System.out.println("Member berhasil dihapus.");
            } else {
                System.out.println("Index tidak valid.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
        }
    }
}
