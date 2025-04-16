package manajemen.membership.gym.util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static String input(String info) {
        System.out.print(info + " : ");
        return sc.nextLine();
    }

    public static int inputInt(String info) {
        System.out.print(info + " : ");
        int data = sc.nextInt();
        sc.nextLine();
        return data;
    }

}
