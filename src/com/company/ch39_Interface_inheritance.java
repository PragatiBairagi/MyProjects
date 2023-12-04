package com.company;

interface SampleInterface{
    void math1();
    void math2();
}

interface  childSampleInterface extends SampleInterface {
    void math3();
    void math4();
}

class mySampleClass implements childSampleInterface{

    @Override
    public void math1() {
        System.out.println("math1");
    }

    @Override
    public void math2() {
        System.out.println("math2");
    }

    @Override
    public void math3() {
        System.out.println("math3");
    }

    @Override
    public void math4() {
        System.out.println("math4");
    }
}

public class ch39_Interface_inheritance {
    public static void main(String[] args) {
        mySampleClass sampleClass = new mySampleClass();
        sampleClass.math1();
        sampleClass.math2();
        sampleClass.math3();
        sampleClass.math4();
    }
}
