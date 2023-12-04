package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class z3_CollectionFramework_LL_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);  //to add  or use add()
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        System.out.println(queue.poll()); //to remove or use element()
        System.out.println(queue);

        System.out.println(queue.peek()); //next element or use remove()
        System.out.println(queue);

    }
}
