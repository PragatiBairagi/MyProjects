package com.company;

import java.util.*;

public class z12_CollectionClass {
    public static void main(String[] args) {

        List<z6_students> list = new ArrayList<>();
        list.add(new z6_students("pragati",4));
        list.add(new z6_students("ratnesh",2));
        list.add(new z6_students("neha",1));
        list.add(new z6_students("isha",3));

        z6_students s1 = new z6_students("neha",1);
        z6_students s2 = new z6_students("isha",3);

//        System.out.println(s1.compareTo(s2));
        Collections.sort(list, new Comparator<z6_students>() {
            @Override
            public int compare(z6_students o1, z6_students o2) {
                return o1.name.compareTo(o2.name);
            }
        });


        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);





//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(23);
//        list.add(34);
//        list.add(18);
//        list.add(97);
//        System.out.println(list);

//        System.out.println("min element :"+ Collections.min(list));
//        System.out.println("max element :"+ Collections.max(list));
//        System.out.println("frequency of element :"+ Collections.frequency(list,3));
//
//        Collections.sort(list); //by-default ascending
//        Collections.sort(list, Comparator.reverseOrder()); //descending
//        System.out.println(list);



    }
}
