package org.example.Collections;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.addLast("B");
        ll.addFirst("C");
        ll.push("E");
        System.out.println(ll);

        ll.poll();
        System.out.println(ll);
        ll.pollLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
