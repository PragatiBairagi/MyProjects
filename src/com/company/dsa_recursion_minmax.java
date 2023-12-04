package com.company;

import java.util.*;

public class dsa_recursion_minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int idx = arrOfIdx(arr,0);
        System.out.println(idx);
    }
    public static int arrOfIdx(int[] arr, int idx){
        if(arr[idx]!=arr.length){
            return -1;
        }
        int misa = arrOfIdx(arr,idx+1);
       if(misa>arr[idx]){
           return misa;
       }
       return arr[idx];
    }
}

