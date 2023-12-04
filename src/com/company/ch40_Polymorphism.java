package com.company;


interface MyCamera2{
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

interface MyWiFi2{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone2{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWiFi2,MyCamera2{


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

    public void sampleMeth(){
        System.out.println("meth");
    }
}


public class ch40_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2();  //this is smartphone but , use it as a camera
//        cam.MyWiFi2(); --> not possible
//        cam.sampleMeth(): --> not possible

        cam.record4kvid();

        MySmartPhone2 smp2 = new MySmartPhone2();
        smp2.getNetworks();
        smp2.recordVoice();
        smp2.connectNetwork("prag");
        smp2.cellNumber(3214);
    }
}
