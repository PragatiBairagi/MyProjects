package com.company;

import java.util.Set;
import java.util.TreeSet;

public class z8_CollectionFramework_TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(35);
        set.add(2);
        set.add(12);
        set.add(4);
        set.add(9);
        System.out.println(set); //print elements in sorted order O(log(n))

        set.remove(4);
        System.out.println(set);

        System.out.println(set.contains(5)); //checks if element is present

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
