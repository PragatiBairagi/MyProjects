package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class z7_CollectionFramework_LinkedHS {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(35);
        set.add(2);
        set.add(12);
        set.add(4);
        set.add(9);
        System.out.println(set); //print in order as defined O(log(n))

        set.remove(4);
        System.out.println(set);

        System.out.println(set.contains(5)); //checks if element is present

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
