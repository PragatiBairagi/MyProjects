package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 25;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread");
//        }

    }
}
public class ch33_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Pragati");
        System.out.println("The id of the thread t1 is : "+ t1.getId());
        System.out.println("The name of the thread t1 is : "+ t1.getName());
        t1.start();

        MyThr t2 = new MyThr("no name");
        System.out.println("The id of the thread t2 is : "+ t2.getId());
        System.out.println("The name of the thread t2 is : "+ t2.getName());
        t2.start();

    }
  }
