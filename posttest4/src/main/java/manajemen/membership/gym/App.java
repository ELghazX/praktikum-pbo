package manajemen.membership.gym;

import manajemen.membership.gym.entity.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new Admin("ghazAdmin", "admin@unmul.ac.id", "superadmin"));
        users.add(new PremiumMember("elghaz", "ghaz@gmail.com"));
        users.add(new RegulerMember("budi", "budi@gmail.com"));
        users.add(new StudentMember("ilham", "ilham@student.unmul.ac.id", "Universitas Mulawarman"));

        System.out.println("=== INFO SEMUA USER ===");
        for (User user : users) {
            user.infoUser();
            System.out.println();
        }

        System.out.println("=== POLYMORPHISM: OVERLOADING ===");
        User user1 = users.get(1);
        user1.greeting();
        user1.greeting("Halo Premium Member! Selamat berlatih kembali!");
    }
}
