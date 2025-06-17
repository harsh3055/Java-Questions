// list is used to store the ordered collection of the elemnts
// maintainted the order of the elements
// allow duplicate element
// implementig classes(concrete classes) are arraylist, vector, linkedlist
// we can use listiterator and can traverse the array from both forward and backward
package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //list is an interface so we cant create an object of type list, we can only create the obeject of class that implements list
        List<String> l = new ArrayList<String>();
        //Arraylist->extends->list->extends->Collections
        l.add("java");
        l.add("cpp");
        l.add("python");
        l.add("python");
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.remove(1));
        System.out.println(l);
        System.out.println(l.remove("python")); //returns true if element present and removed
        System.out.println(l);
        l.set(0, "cpp");
        System.out.println(l);
        System.out.println(l.contains("cpp"));
        //for fetching the elements in list
        l.stream().forEach(System.out::println);
    }
}
