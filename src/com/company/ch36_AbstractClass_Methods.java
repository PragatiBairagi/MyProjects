package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("me base2 ka constructor hoon");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet1();
    abstract public void greet2();
}

 class child2 extends Parent2{
    public void greet1(){
        System.out.println("Good Morning!");
    }
        public void greet2(){
            System.out.println("Good Afternoon");
        }
}

abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class ch36_AbstractClass_Methods {
    public static void main(String[] args) {
//        Parent2 p2 = new Parent2(); //not possible bcs it's an abstract class (you can't make obj from it but can make multiple classes)
        child2 c = new child2();
//        child3 c1 = new child3();  //again not possible , bcs it is also an abstract class
        c.greet1();
        c.greet2();
        c.sayHello();

    }
}
