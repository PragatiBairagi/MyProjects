package com.company;

class Pen {
    String color;
    String type;

    public void write()
    {
        System.out.println("writing something");
    }
}
public class opps {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";



        pen1.write();
    }
}
