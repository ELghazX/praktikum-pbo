package view;

import repository.MemberRepository;
import service.MemberService;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String input(String info){
        System.out.print(info + " : ");
        return sc.nextLine();
    }
    public static int inputInt(String info){
        System.out.print(info + " : ");
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    public static void main(String[] args) {
        MemberRepository memberRepo = new MemberRepository();
        MemberService memberService = new MemberService(memberRepo);
        memberService.registerMember("1", "Ghazali", "20", "081234567890");
        memberService.registerMember("2" , "Zhongli", "6900", "082468024680");
        memberService.registerMember("3", "Fu Hua", "100000", "081236455634");
        int option;
        do{
            System.out.println("\n=== MENU MEMBERSHIP ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Tampilkan Semua Member");
            System.out.println("3. Perbarui Member");
            System.out.println("4. Hapus Member");
            System.out.println("0. Keluar Program");
            option = inputInt("Opsi");
            if (option == 1) {
                var id = input("ID");
                var nama = input("Nama");
                var umur = input("Umur");
                var noTelp = input("No Telpon");
                memberService.registerMember(id, nama, umur, noTelp);
                System.out.println("Member berhasil ditambahkan");

            }else if(option == 2){
                System.out.println("\n Daftar Member: ");
                memberService.getAllMembers().forEach(member ->
                        // System.out.println("ID "+ member.getId() + " | Nama: " + member.getNama())
                        System.out.println(member.infoMember())
                );
            }else if(option == 3){
                String updateId = input("Masukkan ID member yang ingin diubah");
                String newNama = input("Nama Baru");
                String newUmur = input ("Umur Baru");
                String newNoTelp = input ("Telp Baru");

                if (memberService.updateMember(updateId, newNama, newUmur, newNoTelp)){
                    System.out.println("Data Member berhasil diubah");
                }else{
                    System.out.println("Member tidak ditemukan");
                }
            }else if(option == 4){
                String deleteId = input("Masukkan ID member yang ingin dihapus");
                if (memberService.deleteMember(deleteId)){
                    System.out.println("Member berhasil dihapus");
                }else {
                    System.out.println("Member tidak ditemukan");
                }
            }else if (option == 0) {
                System.out.println("Keluar dari Program");
            }else {
                System.out.println("Opsi tidak valid");
            }
        } while(option != 0);

    }

}
