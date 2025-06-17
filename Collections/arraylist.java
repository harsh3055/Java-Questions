package org.example.Collections;

import java.util.ArrayList;

// arraylist is dymnamic size array, which mean unlike array we dont need to give the size when initializing it, it grows automatically
//it is slower than List
// we cant use primitive data types, we need wrapper class
// autoboxing->primitive to wrapper class
// unboxing -> wrapper class to primitive
// arraylist is same as vector in cpp
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.add(1,5);
        System.out.println(arr);
        arr.set(1,2);
        System.out.println(arr);
    }
}
