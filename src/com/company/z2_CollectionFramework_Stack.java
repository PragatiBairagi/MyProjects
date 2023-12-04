package com.company;

import java.util.Stack;

public class z2_CollectionFramework_Stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("tiger");
        animals.push("horse");
        animals.push("dog");

        System.out.println("Stack "+ animals);

        System.out.println(animals.peek());  //top most element

        animals.pop();         //to remove
        System.out.println(animals.peek());

    }

}
