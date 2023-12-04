package com.company;

import java.util.Scanner;

public class dsa_string_print_maze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1,1,n,m,"");
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc,String psf){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        printMazePaths(sr,sc+1,sr,dc,psf+"h");
        printMazePaths(sr+1,sc,sr,dc,psf+"v");
    }
}
