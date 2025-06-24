package org.example.Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
//treeset doesnot allow duplicate elements any insertion of duplicate elements will be ignored
//it doesn't allow duplicate elements
// it used red black tree internally
// red black tress balance itself so that height of tree always reaming ologn making sure all the operation take this much time
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
//        TreeSet<Integer>tss = new TreeSet<>(Comparator.reverseOrder()); for descending order
        System.out.println(ts); // empty as there is no elements
        ts.add(2);    
        ts.add(0);
        ts.add(4);
        System.out.println(ts);
        System.out.println(ts.stream().count());
        System.out.println(ts.ceiling(1)); //first >= x like lower bound
        System.out.println(ts.floor(5)); // first <= x
        System.out.println(ts.higher(4)); //first >x like upper bound
        System.out.println(ts.lower(2));//first < x;
        ts.addAll(Arrays.asList(10,15,20,30));
        System.out.println(ts);
        System.out.println(ts.first());
        


        SortedSet<Integer> greaterelements = ts.tailSet(15, true); //inclusie
        System.out.println(greaterelements);

        SortedSet<Integer> strictgreaterele = ts.tailSet(15, false);
        System.out.println(strictgreaterele);

        SortedSet<Integer> lower = ts.headSet(15);
        SortedSet<Integer> strictlower = ts.headSet(15, true);
        System.out.println(lower);
        System.out.println(strictlower);



// add remove search takes logn time
    }
}
//A Red-Black Tree have the following properties:
//
//    Node Color: Each node is either red or black.
//    Root Property: The root of the tree is always black.
//    Red Property: Red nodes cannot have red children (no two consecutive red nodes on any path).
//    Black Property: Every path from a node to its descendant null nodes (leaves) has the same number of black nodes.
//    Leaf Property: All leaves (NIL nodes) are black.