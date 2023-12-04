package com.company;

import java.util.Scanner;

public class ch2_userInput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        float b = sc.nextFloat();
//        float var10000 = a + b ;
        boolean bl = sc.hasNextInt();
        System.out.println(bl);
        String str  = sc.nextLine();   // Reads the whole sentences
        System.out.println(str);



    }
}
