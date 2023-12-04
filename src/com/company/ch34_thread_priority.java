package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
//        System.out.println("Thank you "+ this.getName());
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you "+ this.getName());
        }

    }
}
public class ch34_thread_priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("pragati1");
        MyThr1 t2 = new MyThr1("pragati2");
        MyThr1 t3 = new MyThr1("pragati3");
        MyThr1 t4 = new MyThr1("pragati4");
        MyThr1 t5 = new MyThr1("pragati5");

        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
