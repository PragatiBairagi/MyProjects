package com.company;

abstract class Pen1{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen1{
    void changeNib(){
        System.out.println("change the nib");
    }

    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }
}


class Monkey{
   void jump(){
       System.out.println("jumping");
   }

   void bite(){
       System.out.println("biting");
   }

}

interface BasicAnimal{
    void eat();
    void sleep();
}

class human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("speaking");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}



public class practice_08 {
    public static void main(String[] args) {
//        FountainPen pen = new FountainPen();
//        pen.changeNib();
//        pen.refill();
//        pen.write();
//************************************
//        Monkey monkey = new Monkey();
//        monkey.bite();
//        monkey.jump();
//        human hum = new human();
//        hum.eat();
//        hum.sleep();
//************************************
        Monkey monkey = new human();  //human is also a monkey
        monkey.jump();
        monkey.bite();

        BasicAnimal dog = new human();
        dog.eat();
        dog.sleep();

        

    }
}
