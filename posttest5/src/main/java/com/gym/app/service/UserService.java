package com.gym.app.service;

import java.time.LocalDate;

import com.gym.app.entity.Staff;
import com.gym.app.entity.Member;
import com.gym.app.entity.User;
import com.gym.app.repository.UserRepository;

public class UserService {
    private UserRepository userRepo;
    private int idCounter = 2;

    public UserService() {
    };

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
        userRepo.addUser(new Staff(1, "admin", "admin", "superadmin"));
    }

    public void registerStaff(String name, String password, String shift) {
        Staff staff = new Staff(idCounter++, name, password, shift);
        userRepo.addUser(staff);
        System.out.println("Staff registered: " + staff.getName());
    }

    public void registerMember(String name, String password) {
        Member member = new Member(idCounter++, name, password, LocalDate.now().plusMonths(1));
        userRepo.addUser(member);
        System.out.println("Member registered: " + member.getName());
    }

    public void updateUser(int id, String name, String password) {
        User user = userRepo.findById(id);
        if (user != null) {
            user.setName(name);
            user.setPassword(password);
            System.out.println("User updated.");
        }
    }

    public void deleteUser(int id) {
        userRepo.removeUser(id);
        System.out.println("User removed.");
    }

    public void showAllUsers() {
        System.out.println("\n--- Daftar Semua Pengguna ---");
        for (User user : userRepo.getAll()) {
            System.out
                    .println("ID: " + user.getId() + " | Nama: " + user.getName() + " | Password: " + user.getPassword()
                            + " | Role: " + user.getRole());
        }
    }

    public void showMembership(int id) {
        User user = userRepo.findById(id);
        if (user instanceof Member member) {
            System.out.println("Member: " + member.getName() + " | Expired: " + member.getExpiredDate());
        } else {
            System.out.println("Bukan member.");
        }
    }

    public void extendMembership(int id) {
        User user = userRepo.findById(id);
        if (user instanceof Member member) {
            member.extendMembership();
            System.out.println("Membership diperpanjang hingga: " + member.getExpiredDate());
        }
    }

    public UserRepository getUserRepo() {
        return userRepo;
    }
}
