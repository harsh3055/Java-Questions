package org.example.Collections;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
// if the capacityincrement is mentioned then vector will increment its capacity based on this otherwise it will double on every allocation
        // Add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // Insert an element at index 1
        v.insertElementAt(0, 1);

        // Remove the element at index 2
        v.removeElementAt(2);
        v.removeLast();

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }
        Vector<Integer> defaultGrowth = new Vector<>(2); // capacity will get doubled if not mentioned
        for(int i = 0; i<=10; i++){
            defaultGrowth.add(i);
        }
        Vector<Integer> limitGrowth = new Vector<>(2,2);
        for(int i = 0; i<=10; i++){
            limitGrowth.add(i);
        }
        System.out.println("default growth capacity: " + defaultGrowth.capacity());
        System.out.println("limit growth capacity: " + limitGrowth.capacity());
        String result = defaultGrowth.toString().concat("harsh");
        System.out.println(result.indexOf("harsh"));
    }
}
