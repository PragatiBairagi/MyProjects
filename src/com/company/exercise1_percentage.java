package com.company;

import java.util.Scanner;

public class exercise1_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics");
        float a = sc.nextFloat();
        System.out.println("Enter marks of Chemistry");
        float b = sc.nextFloat();
        System.out.println("Enter marks of Maths");
        float c = sc.nextFloat();
        System.out.println("Enter marks of IP");
        float d = sc.nextFloat();
        System.out.println("Enter marks of English");
        float e = sc.nextFloat();

        float sum = ((a + b + c + d + e)/500)*100;
        System.out.println("Your percentage is : ");

        System.out.println(sum);
    }

}
