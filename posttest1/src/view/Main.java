package view;

import repository.MemberRepository;
import service.MemberService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberRepository memberRepo = new MemberRepository();
        MemberService memberService = new MemberService(memberRepo);
        int option = sc.nextInt();
        sc.nextLine();

        do{
            switch(option){
                case 1:
                    System.out.println("ID: ");
            }


        } while(option != 0);

    }

}
