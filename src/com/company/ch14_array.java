package com.company;

public class ch14_array {
    public static void main(String[] args) {
// array starts from 0 to n-1
        int [] marks;            // declaration
        marks = new int[5];      // memory allocation
 /*      or
        int [] marks = new int[5];
        or
        int[] marks = {100,90,80,96,98}
  */
        marks[0] = 100;
        marks[2] = 90;
        marks[3] = 80;
        marks[4] = 96;
        marks[1] = 98;
// marks[5]= 89; ----> throws an error
        System.out.println(marks[0]);
        System.out.println("This is the best book to read " );
    }
}
