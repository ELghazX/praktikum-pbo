package manajemen.membership.gym.view;

import manajemen.membership.gym.service.MemberService;
import manajemen.membership.gym.util.*;

public class MemberView {

    private MemberService memberService;

    public MemberView(MemberService memberService) {
        this.memberService = memberService;
    }

    public void showMember() {
        System.out.println("\n Daftar Member: ");
        System.out.println("ID  | Nama  | Umur | NoTelp");
        memberService.getAllMembers().forEach(member ->
        // System.out.println("ID "+ member.getId() + " | Nama: " + member.getNama())
        System.out.println(member.infoMember()));
    }

    public void addMember() {
        var id = InputUtil.input("ID");
        var nama = InputUtil.input("Nama");
        var umur = InputUtil.input("Umur");
        var noTelp = InputUtil.input("No Telpon");
        memberService.registerMember(id, nama, umur, noTelp);
        System.out.println("Member berhasil ditambahkan");
    }

    public void updateMember() {

        String updateId = InputUtil.input("Masukkan ID member yang ingin diubah");
        String newNama = InputUtil.input("Nama Baru");
        String newUmur = InputUtil.input("Umur Baru");
        String newNoTelp = InputUtil.input("Telp Baru");

        if (memberService.updateMember(updateId, newNama, newUmur, newNoTelp)) {
            System.out.println("Data Member berhasil diubah");
        } else {
            System.out.println("Member tidak ditemukan");
        }

    }

    public void deleteMember() {
        String deleteId = InputUtil.input("Masukkan ID member yang ingin dihapus");
        if (memberService.deleteMember(deleteId)) {
            System.out.println("Member berhasil dihapus");
        } else {
            System.out.println("Member tidak ditemukan");
        }
    }

    public void showMainMenu() {
        memberService.registerMember("1", "Ghazali", "20", "081234567890");
        memberService.registerMember("2", "Zhongli", "6900", "082468024680");
        memberService.registerMember("3", "Fu Hua", "100000", "081236455634");
        int option;
        do {
            System.out.println("\n=== MENU MEMBERSHIP ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Tampilkan Semua Member");
            System.out.println("3. Perbarui Member");
            System.out.println("4. Hapus Member");
            System.out.println("0. Keluar Program");
            option = InputUtil.inputInt("Opsi");
            if (option == 1) {
                addMember();
            } else if (option == 2) {
                showMember();
            } else if (option == 3) {
                updateMember();
            } else if (option == 4) {
                deleteMember();
            } else if (option == 0) {
                System.out.println("Keluar dari Program");
            } else {
                System.out.println("Opsi tidak valid");
            }
        } while (option != 0);
    }

}
