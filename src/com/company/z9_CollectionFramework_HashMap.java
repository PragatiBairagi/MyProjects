package com.company;

import java.util.HashMap;
import java.util.Map;

public class z9_CollectionFramework_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        System.out.println(numbers); //print in random manner

//        numbers.put("two",22); //override

        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

//        if(!(numbers.containsKey("two"))){
//            numbers.put("two",22);
//        }

//        or use

        numbers.putIfAbsent("two",2);

//        numbers.put("four",4);


        for (Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (Integer value:numbers.values()){
            System.out.println(value);
        }
    }
}
