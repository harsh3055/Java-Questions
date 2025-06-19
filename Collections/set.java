package org.example.Collections;

import java.util.*;


// it is an unoredered collection of values
// it doesn't allow duplicate
//implementation class : hashset, treeset, linkedhashset
//anonymous inner class are those interface which implements and interface
public class set {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        //hashset store the values based on hashcode
        //when we use linkedhasset when we want to maintain the order of insertion and also want to access element using index
        //treeset sort the elements
        System.out.println(s.isEmpty());
        s.add(1);
        s.add(4);
        s.add(7);
        s.add(1000);
        s.add(9999);
        s.add(-5);
        s.add(2);
        s.add(0);
        s.add(1);
        System.out.println(s);

        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> u = new HashSet<Integer>(a);
        u.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(u);

        // To find intersection
        Set<Integer> i = new HashSet<Integer>(a);
        i.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(i);

        // To find the symmetric difference
        Set<Integer> d = new HashSet<Integer>(a);
        d.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(d);

        Iterator<Integer> itr = s.iterator();
//        Iterator<Integer> itr2 = s.descendingIterator(); because desecning operator is in the treeset class not in interface set
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

    }
}
