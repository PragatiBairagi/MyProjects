package com.company;

import java.util.Scanner;

public class ch11_switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        age = sc.nextInt();
        switch (age)
        {
            case 24 :
                System.out.println("You are independent");
                break;
            case 35 :
                System.out.println("You are stable");
                break;
            case 40 :
                System.out.println("You are retired");

            default:
                System.out.println("enjoy the life!");

        }
        System.out.println("enjoy the life!");
    }
}
