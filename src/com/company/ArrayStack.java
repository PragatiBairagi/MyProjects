package com.company;

import java.util.*;

public class ArrayStack{
    int max = 3;
    int top = -1;
    int arr[] = new int[max];

    void push(int item){
        if(top==max-1){
            System.out.println("stack overflow!!\n");
        }
        else{
            top++;
            arr[top] = item;
            System.out.println("item pushed is :"+arr[top]);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("stack underflow!!\n");
        }
        else{
            System.out.println("item popped is: "+arr[top--]);
        }
    }

    void display(){
        if(top==-1){
            System.out.println("empty stack!!\n");
        }
        else{
            System.out.println("items are: \n");
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayStack stack = new ArrayStack();
        while(true) {
        System.out.println("\n1.push\n2.pop\n3.display\n4.exit\n");
        System.out.println("enter your choice:\n");
        int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the item to be pushed:\n");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:stack.pop();
                    break;
                case 3:stack.display();
                    break;
                case 4:System.exit(0);
                default:
                    System.out.println("enter correct choice:\n");

            }
        }
    }
}





























// import java.util.Scanner;
// public class ArrayStack {
//    public static final
//    int max = 3;
//    int top = -1;
//    int arr[] = new int[max];
//
//    void push(int item){
//        if(top == max-1){
//            System.out.println("overflow\n");
//        }
//        else{
//            top++;
//            arr[top] = item;
//            System.out.println("item added is : "+arr[top]);
//        }
//    }
//
//    void pop(){
//        if(top==-1){
//            System.out.println("underflow \n");
//        }
//        else{
//            System.out.println("item popped is: "+arr[top--]);
//        }
//    }
//
//    void display(){
//        if(top==-1){
//            System.out.println("empty stack \n");
//        }
//        else{
//            for (int i=0;i<=top;i++){
//                System.out.println("items are : "+arr[i]);
//            }
//        }
//
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        ArrayStack stack = new ArrayStack();
//        while(true) {
//            System.out.println("enter your choice: ");
//            System.out.println("\n1.push\n2.pop\n3.display\n4.exit");
//            int ch = sc.nextInt();
//            switch (ch){
//                case 1:
//                    System.out.println("enter the item to be pushed: ");
//                    int item = sc.nextInt();
//                    stack.push(item);
//                    break;
//                case 2:
//                    stack.pop();
//                    break;
//                case 3:
//                    stack.display();
//                    break;
//                case 4:
//                    System.exit(0);
//                default:
//                    System.out.println("enter correct choice: ");
//            }
//        }
//    }
//}

