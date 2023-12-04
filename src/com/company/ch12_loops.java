package com.company;

import java.util.Scanner;

public class ch12_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //FOR LOOP
//        for (int i = 1; i<=10; i++) {
//            System.out.println(i);
//        }
        //************************************
        //WHILE LOOP
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }
        //*************************************
        //DO WHILE LOOP
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=10);

    }
}
