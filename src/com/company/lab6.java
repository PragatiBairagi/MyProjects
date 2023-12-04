package com.company;

//import java.util.*;
//
// class Squaree extends Thread{
//    int x;
//    Squaree(int n){
//        x = n;
//    }
//    public void run(){
//        int sqr = x*x;
//        System.out.println("the square of "+x+" is "+sqr);
//    }
//}
//
//class Cube extends Thread{
//     int x;
//     Cube(int n){
//         x = n;
//     }
//     public void run(){
//         int cub = x*x*x;
//         System.out.println("the cube of "+x+" is "+cub);
//     }
//}
//
//class Number extends Thread{
//
//     public void run(){
//         Random ran = new Random();
//         for(int i = 0;i<10;i++){
//             int RandomInt = ran.nextInt(100);
//             System.out.println("random integer generated is "+RandomInt);
//             Squaree s = new Squaree(RandomInt);
//             s.start();
//             Cube c = new Cube(RandomInt);
//             c.start();
//
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(InterruptedException ex){
//                 System.out.println(ex);
//             }
//         }
//     }
//}
//
//
//public class lab6{
//     public static void main(String args[]){
//         Number n = new Number();
//         n.start();
//     }
//}