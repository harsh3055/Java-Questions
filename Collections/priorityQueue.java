package org.example.Collections;

import java.util.PriorityQueue;
import java.util.Queue;
// it process element by prioriy rather than first in first out like queue
// it provide ologn time for add and poll method
//default intial capacity is 11
//
public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); // min heap minimum in top
        pq.add(1);
        pq.add(4);
        pq.add(0);
        System.out.println(pq.element());
        System.out.println(pq.toString());
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
}
