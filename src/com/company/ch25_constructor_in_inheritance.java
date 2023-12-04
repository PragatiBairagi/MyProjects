package com.company;

class Base1 {

    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x is "+ x);
    }
}
class Derived1 extends Base1{
         Derived1(){
//             super(0);
             System.out.println("I am a derived class constructor");
         }
         Derived1(int x, int y){
             super(x);
             System.out.println("I am an overloaded derived constructor with value of y is "+ y) ;
         }
}
class childDerived1 extends Derived1{
    childDerived1(){
        System.out.println("I am a child of derived constructor") ;
    }
    childDerived1(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded child of derived constructor with value of z is "+ z) ;
    }
}

public class ch25_constructor_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        Derived1 d = new Derived1(5,6) ;
        childDerived1 c = new childDerived1(2,4,5) ;

    }
}
