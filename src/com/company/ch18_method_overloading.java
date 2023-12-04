package com.company;

public class ch18_method_overloading {
    static void foo(){
        System.out.println("What's up buddie!");
    }
    static void foo(int a){
        System.out.println("What's up "+ a + " buddie!");
    }
    static void foo(int a, int b){
        System.out.println("What's up "+ a + " buddie!");
        System.out.println("What's up "+ b + " buddie!");
    }


    static void change(int a) {
        a = 27;
    }

    static void change2(int [] arr) {
        arr[0]= 27;
    }
    static void tellJoke() {
        System.out.println("I invented a new word \n" + "\"Plagiarism\"");
    }
    public static void main(String[] args){
        //tellJoke();



// METHOD OVERLOADING
        foo();
        foo( 3000);
        foo(3000, 9000);
    }
}
