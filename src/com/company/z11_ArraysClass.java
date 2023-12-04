package com.company;

import java.util.Arrays;

public class z11_ArraysClass {
    public static void main(String[] args) {

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(numbers,4);
//        System.out.println("the index of element in the array is "+index);

        int[] number = {4,2,6,7,3,8,9,10,5,1};
        Arrays.sort(number);{

            Arrays.fill(number,5); //5 is added to all the positions

            for (int i: number){
                System.out.print(i+ " ");
            }

        }    }
}
