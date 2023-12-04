package com.company;

public class ch3_operator_expression {
    public static void main(String[] args) {
        //1. arithmetic operators
        int a = 34;
        // int b = a%4;   //modular operator
        //3.7%1.2 ---> will return decimal remainder

        //2. assignment operators
        int b = 5;
        b += 4;
        System.out.println(b);

        //3. comparison operators
        System.out.println(56==5);
        System.out.println(5==5);

        //4. logical operators
        //System.out.println(3<6 && 4<6); //both should be true
        System.out.println(4<3 || 5>1);   //any one should be true

        //5. Bitwise operators
        System.out.println(4&3);
    }
}
