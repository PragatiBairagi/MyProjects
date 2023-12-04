package com.company;

import java.util.Scanner;

public class lab5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b values: ");
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        sc.close();

        try{
            if(b==0)
                throw new ArithmeticException("divide by zero");
                int c = a/b;
                System.out.println("result of "+a+"/"+b+"is " + c);

        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}






















//import java.util.*;
//public class lab5 {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("enter the values of A ad B:\n");
//        System.out.println("enter A\n");
//        a = sc.nextInt();
//        System.out.println("enter B\n");
//        b = sc.nextInt();
//        sc.close();
//        try {
//            if(b==0)
//                throw new ArithmeticException("divided by zero") ;
//            c = a/b;
//            System.out.println("the value of "+a+"/"+b+" is "+c);
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//
//    }
//}











