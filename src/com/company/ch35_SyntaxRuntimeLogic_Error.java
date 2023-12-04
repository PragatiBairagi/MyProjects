package com.company;

import java.util.Scanner;

public class ch35_SyntaxRuntimeLogic_Error {
    public static void main(String[] args) {
        // Syntax error
        // int a = 0   :-  semicolon missing
        // b = 0;      :-  b is not declared

        //Logical error
        //Write a program to print all the prime no. from 1 to 10
        System.out.println(2);
        for (int i = 1; i<5; i++){
            System.out.println(2*i*1);
        }

        //Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
