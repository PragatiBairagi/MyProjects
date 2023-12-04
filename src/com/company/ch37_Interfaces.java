package com.company;

interface Bicycle{
    int a =12;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
    interface HornBicycle{
    public int x = 5;
    void blowHornk3g();
    void blowHornmhn();
    }

    class AvonCycle implements Bicycle, HornBicycle{
//    public int x = 45;
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }

        @Override
        public void applyBrake(int decrement) {
            System.out.println("applying brake! ");
        }

        @Override
        public void speedUp(int increment) {
            System.out.println("applying speedup");

        }

        @Override
        public void blowHornk3g() {
            System.out.println("kabhi khushi kabhi gam po po po!");
        }

        @Override
        public void blowHornmhn() {
            System.out.println("mai hoon naa po po po");
        }
    }

public class ch37_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        System.out.println(cycle.a);

//        cycle.a = 34; // not possible , you can't modify the properties in Interface as they are final.
        cycle.blowHornk3g();
        cycle.blowHornmhn();
        System.out.println(cycle.x);
    }
}

