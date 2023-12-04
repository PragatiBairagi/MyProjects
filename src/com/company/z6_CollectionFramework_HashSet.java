package com.company;

import java.util.HashSet;
import java.util.Set;

public class z6_CollectionFramework_HashSet {
    public static void main(String[] args) {

        Set<z6_students> studentSet = new HashSet<>();
        studentSet.add(new z6_students("pragati",1));
        studentSet.add(new z6_students("ratnesh",2));
        studentSet.add(new z6_students("neha",3));

        studentSet.add(new z6_students("isha",3));

        z6_students s1 = new z6_students("neha",3);
        z6_students s2 = new z6_students("isha",3);
        System.out.println(s1.equals(s2));

        System.out.println(studentSet);



//        Set<Integer> set = new HashSet<>();
//
//        set.add(35);
//        set.add(2);
//        set.add(12);
//        set.add(4);
//        set.add(9);
//        System.out.println(set); //print in random order O(1)
//
//        set.remove(4);
//        System.out.println(set);
//
//        System.out.println(set.contains(5)); //checks if element is present
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//        System.out.println(set);
    }
}
