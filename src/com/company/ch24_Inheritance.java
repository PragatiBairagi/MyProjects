package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
   int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY(){
       return y;
     }
}

public class ch24_Inheritance {
    public static void main(String[] args) {
        //Creating an object of Base class
        Base b = new Base();
        b.setX(4);          // use of only X is possible
        System.out.println(b.getX());

        //Creating an object of Derived class
        Derived d = new Derived();
        d.setY(43);        //use of both X & Y are possible
        System.out.println(d.getY());
    }
}

