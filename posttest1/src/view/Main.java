package view;

import repository.MemberRepository;
import service.MemberService;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String input(String info){
        System.out.println(info + " : ");
        return sc.nextLine();
    }
    public static int inputInt(String info){
        System.out.println(info + " : ");
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    public static void main(String[] args) {
        MemberRepository memberRepo = new MemberRepository();
        MemberService memberService = new MemberService(memberRepo);
        int option;
        do{
            System.out.println("\n=== MENU MEMBERSHIP ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Baca Member");
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
                System.out.println();
            }else if(option == 4){
                System.out.println();
            }else if(option == 0){
                System.out.println();
            }


        } while(option != 0);

    }

}
