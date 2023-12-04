package com.company;

import java.util.Scanner;

public class ch1_sum {

        public static void main(String[] args) {
            System.out.println("taking input from user");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1");
            float a = sc.nextFloat();
            System.out.println("Enter number 2");
            float b = sc.nextFloat();

            //float var10000 = a + b;
            //boolean bl = sc.hasNextInt();
            System.out.println(a+b);

            //to enter even nos.
            System.out.println("enter n ");
            int n = sc.nextInt();
            int i;

            for( i = 2;i<=n ; i+=2){
                System.out.println(i+" ");
            }

         }
    }
