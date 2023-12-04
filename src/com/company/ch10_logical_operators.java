package com.company;

import java.util.Scanner;

public class ch10_logical_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        if(a && b)   //logical &
//        if(a||b)     //logical or
//        if(!a)        //logical not
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }
}
