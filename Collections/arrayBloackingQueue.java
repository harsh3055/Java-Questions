package org.example.Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ArrayBlockingQueue;

public class arrayBloackingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(5);
        abq.add(1);
        abq.add(2);
        abq.add(3);
        abq.add(5);
        abq.add(3);
        System.out.println(abq.size());
        System.out.println(abq.toString());
        System.out.println(abq.remove(3));
        System.out.println(abq);
        Iterator it = abq.iterator(); //poitns at index 0
        while(it.hasNext()){ //check if cursor point to valid element or not
            System.out.println(it.next()); // return the current element and increment the cursor to next elemenet
        }
    }
}
