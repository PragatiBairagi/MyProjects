package com.company;

import java.util.Scanner;

public class ch41_try_catch_exceptions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the values of A ad B:\n");
        System.out.println("enter A\n");
        a = sc.nextInt();
        System.out.println("enter B\n");
        b = sc.nextInt();
        sc.close();
        try {
            if(b==0)
                throw new ArithmeticException("divided by zero") ;
            c = a/b;
            System.out.println("the value of "+a+"/"+b+" is "+c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
