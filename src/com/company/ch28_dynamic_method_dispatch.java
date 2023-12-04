package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8:00 am");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}

public class ch28_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();   //Allowed
//        SmartPhone smobj = new SmartPhone();  //Allowed
//        obj.name();
        Phone obj = new SmartPhone();   // run time polymorphism
//        SmartPhone obj = new Phone(); //Not Allowed
        obj.showTime();
        obj.on();       // allowed
//        obj.music(); // Not allowed

    }
}
