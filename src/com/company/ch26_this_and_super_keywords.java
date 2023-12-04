package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("mai ek constructor hoon");
    }

}


public class ch26_this_and_super_keywords {
    public static void main(String[] args) {
        EkClass e = new EkClass(55);
        DoClass d = new DoClass(4);
        System.out.println(e.getA());

    }
}
