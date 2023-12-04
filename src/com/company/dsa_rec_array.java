package com.company;
import java.util.*;

public class dsa_rec_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(n);
//        int[] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        displayArr(arr,0);
    }

    public static void display(int n){
        if(n==0){
            return;
        }
        display(n-1);
        System.out.println(n);
    }
//    public static void displayArr(int[] arr,int idx){
//        if(idx== arr.length){
//            return;
//        }
//
//        displayArr(arr,idx+1);
//        System.out.println(arr[idx]);
//    }
}
