package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class z4_CollectionFramework_PriorityQ {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq); // lowest element will be on top

        System.out.println(pq.poll()); //remove element with high priority
        System.out.println(pq);

        System.out.println(pq.peek()); //next element to be removed
        System.out.println(pq);


    }
}
