package org.example.Collections;

import java.util.LinkedList;
import java.util.Queue;

// queue in an interface and linkedlist and priority queue is the implementaion class
// linkedlist can act as list add and get(index) and as queue as offer, poll, and deque as
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);// insert the element in the first palce
        q.offer(2);
        q.offer(3);
        while(!q.isEmpty()){
            System.out.println(q.peek()); // get the first element
            //q.poll(); // remove the first element or top element
            q.remove(); // remove the top element
        }
    }
}
