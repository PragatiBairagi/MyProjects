package com.company;

import java.util.ArrayDeque;

public class z5_CollectionFramework_DQ {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.offerFirst(3); //adds as first element
        adq.offerLast(2);  //adds as last element
        adq.offer(5);

        System.out.println(adq);

        System.out.println(adq.peek());  //show first element to be removed
        System.out.println(adq.peekFirst()); // same as peek
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());  //removes first element
        System.out.println("poll() "+adq);

        System.out.println(adq.pollFirst());  //same like poll
        System.out.println("pollFirst() "+adq);

        System.out.println(adq.pollLast()); //removes last element
        System.out.println("pollLast() "+adq);
    }
}
