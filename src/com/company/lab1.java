package com.company;

import java.util.*;

class Student{
    String usn,name,branch,phone;
}

public class lab1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of students:\n");
        int n = sc.nextInt();

        Student[] std = new Student[n];

        for(int i=0;i<n;i++) {
             std[i] = new Student();
             sc.nextLine();
            System.out.println("enter details of student :" + (i + 1));
            System.out.println("enter USN:\n");
            std[i].usn = sc.nextLine();
            System.out.println("enter NAME:\n");
            std[i].name = sc.nextLine();
            System.out.println("enter BRANCH:\n");
            std[i].branch = sc.nextLine();
            System.out.println("enter PHONE NO.:\n");
            std[i].phone = sc.nextLine();

        }
        for(int i=0;i<n;i++) {
            System.out.println("the details of student :" + (i + 1));
            System.out.println("USN: \t "+std[i].usn+"NAME: \t "+std[i].name+"BRANCH: \t "+std[i].branch+"PHONE: \t "+std[i].phone);
        }
    }
}




























//
//import java.util.Scanner;
//class Student{
//    String USN;
//    String name;
//    String branch;
//    String phone;
//
//}
//
//public class lab1 {
//    public static void main(String args[]){
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("enter the no. of stds: ");
//        int n = sc.nextInt();
//
//        Student[] std = new Student[n];
//        System.out.println("enter stds. details: ");
//        for(int i=0;i<n;i++){
//            System.out.println("student "+(i+1)+": ");
//            std[i] = new Student();
//            sc.nextLine();
//            System.out.print("USN: ");
//            std[i].USN =  sc.nextLine();
//            System.out.print("name: ");
//            std[i].name = sc.nextLine();
//            System.out.print("branch: ");
//            std[i].branch = sc.nextLine();
//            System.out.print("phone: ");
//            std[i].phone = sc.nextLine();
//            System.out.println();
//
//        }
//        for (int i= 0;i<n;i++){
//            System.out.println("details of student "+(i+1)+": ");
//            System.out.println("USN: "+ std[i].USN);
//            System.out.println("name: "+ std[i].name);
//            System.out.println("branch: "+ std[i].branch);
//            System.out.println("phone: "+ std[i].phone);
//            System.out.println();
//        }
//        sc.close();
//    }
//}





















