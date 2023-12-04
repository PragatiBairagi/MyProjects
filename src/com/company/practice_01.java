package com.company;

import java.util.Scanner;

public class practice_01 {
    public static void main(String[] args) {
//        float a =7/4f*9/2f;
//        System.out.println(a);

        //*******************************************
//        char grd = 'C';
//        grd = (char)(grd+8);
//        System.out.println(grd);
//        //decrypting the grade
//        grd = (char)(grd-8);
//        System.out.println(grd);

        //*******************************************
        //checking if no. is greater or not
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value");
//        int b = sc.nextInt();
//        System.out.println(b>8);

        //********************************************
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();

        float k = (v*v-u*u)/(2*a*s);
        System.out.println(k);


    }

}
