package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

class Practice7a extends Thread{
    public void run(){
       while(true) {
           System.out.println("Good Morning");
       }
    }
}
class Practice7b extends Thread{
//    public void run(){
//        while(true){
//            try {
//                Thread.sleep(50);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
//    }
}
public class practice_07 {
    public static void main(String[] args) {
        Practice7a p1 = new Practice7a();
        Practice7b p2 = new Practice7b();

//        p1.setPriority(5);
//        p2.setPriority(8);

        System.out.println(p1.getPriority()); //Normal Priority
        System.out.println(p2.getPriority()); //Normal Priority

        System.out.println(p2.getState());

//        p1.start();
        p2.start();
        System.out.println(Thread.currentThread().getState());

    }
}
