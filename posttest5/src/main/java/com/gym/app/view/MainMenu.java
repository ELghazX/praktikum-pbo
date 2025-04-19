package com.gym.app.view;

import java.util.Scanner;

import com.gym.app.entity.User;
import com.gym.app.repository.UserRepository;
import com.gym.app.service.UserService;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserRepository userRepo = new UserRepository();
        UserService userService = new UserService(userRepo);

        while (true) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            User user = userRepo.findByNameAndPassword(username, password);
            if (user == null) {
                System.out.println("Login gagal. Coba lagi.");
                continue;
            }

            switch (user.getRole()) {
                case "superadmin" -> superAdminMenu(sc, userService);
                case "staff" -> staffMenu(sc, userService);
                case "member" -> memberMenu(userService, user.getId());
                default -> System.out.println("Role tidak dikenali.");
            }
        }
    }

    static void superAdminMenu(Scanner sc, UserService userService) {
        while (true) {
            System.out.println("\n--- Superadmin Menu ---");
            System.out.println("1. Register Staff");
            System.out.println("2. Lihat Semua Pengguna");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    System.out.print("Shift: ");
                    String shift = sc.nextLine();
                    userService.registerStaff(nama, password, shift);
                }
                case 2 -> userService.showAllUsers();
                case 3 -> {
                    System.out.print("ID User: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama baru: ");
                    String nama = sc.nextLine();
                    System.out.print("Password baru: ");
                    String password = sc.nextLine();
                    userService.updateUser(id, nama, password);
                }
                case 4 -> {
                    System.out.print("ID User: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    userService.deleteUser(id);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void staffMenu(Scanner sc, UserService userService) {
        while (true) {
            System.out.println("\n--- Staff Menu ---");
            System.out.println("1. Register Member");
            System.out.println("2. Lihat Semua Pengguna");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    userService.registerMember(nama, password);
                }
                case 2 -> userService.showAllUsers();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void memberMenu(UserService userService, int memberId) {
        System.out.println("\n--- Member Menu ---");
        userService.showMembership(memberId);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Perpanjang Membership");
        System.out.println("0. Logout");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();
        sc.nextLine();
        if (pilih == 1) {
            userService.extendMembership(memberId);
        }
    }
}
