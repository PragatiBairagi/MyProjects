package com.company;

import javax.swing.*;

interface MyCamera{
        void takeSnap();
        void recordVoice();
        private void greet(){
            System.out.println("hello ");
        }
        default void record4kvid(){
            greet();
            System.out.println("recording in 4k...");
        }
}

interface MyWiFi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWiFi,MyCamera{


    @Override
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVoice(){
        System.out.println("recording voice");
    }
//    public void record4kvid(){
//        System.out.println("recording again in 4k");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networkList = {"prag","neha","rat"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("connecting to "+network);
    }
}


public class ch38_IntExmp_DefaultMeth {
    public static void main(String[] args) {
        MySmartPhone ms  = new MySmartPhone();
//        ms.greet(); //throws an error as it is private
        ms.record4kvid();

        String[] arr = ms.getNetworks();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
