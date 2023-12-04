package com.company;

class C1 {
    public int x = 5; // accessible everywhere
    protected int y = 34; // accessible to same package
    int z = 4; //default
    private  int a = 44; // accessible only to that class
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
    class C2 extends C1{

    }
}
public class ch30_accessModifiers_inJava {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1(); // can access all modifiers
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);   // Gives error
        System.out.println("  ");
    }
}
