package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class z1_CollectionFramework_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

//        list.add(4); // to add
//        System.out.println(list);
//
//        list.add(2,6);
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList<>();
//        newList.add(150);
//        newList.add(160);
//
//        list.addAll(newList);
//        System.out.println(list);
//
//        System.out.println(list.get(1));

//        list.remove(1); // to remove "position"
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(6)); // remove element
//        System.out.println(list);
//
//        list.clear(); // return empty list
//        System.out.println(list);

//        list.set(2,1000);
//        System.out.println(list);
//
//        System.out.println(list.contains(33)); // check if element is present

        for (int i=0;i<list.size();i++){  //using for loop
            System.out.println("the element is : "+list.get(i));
        }

//        for (Integer element: list) {   //using for-each
//            System.out.println("the element is : "+element);
//        }

//        Iterator<Integer> it = list.iterator();  //using iterator






//        while (it.hasNext()){
//            System.out.println("iterator "+it.next());
//        }



    }
}
