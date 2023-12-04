package com.company;

import java.util.Scanner;

public class ch42_exceptions {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 88;
        marks[2] = 86;
        marks[3] = 56;
        marks[4] = 77;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int idx = sc.nextInt();

        System.out.println("enter the no. you want to divide with ");
        int number = sc.nextInt();
        try{
            System.out.println("the value at array index entered is : "+ marks[idx] );
            System.out.println("the value at array-value/number is : "+ marks[idx]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured ");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured ");
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println("some other exception occured ");
            System.out.println(e);
        }
     }
}
