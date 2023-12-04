package com.company;

import java.util.*;

public class dsa_recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        toh(n,s,h,d);
    }

    public static void toh(int n, int s, int h, int d){
        if(n==0){
            return ;
        }

         toh(n-1,s,h,d);
        System.out.println(n+ " [ "+s +"-> "+d +" ]" );
         toh(n-1,h,d,s);

    }
}
