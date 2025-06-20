package org.example.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//hashset class implements set interface from the collection interface
//hashset used to store data for fast access and also when we dont want to store the duplicate
//INTERNAL WORKING OF HASHSET
//when we create a hashset it internaly create a hashamp ans when do .add it internally call .put of hashmap
//every element we sace in hashset it get save in hashmap like (ele, "PRESENT");
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(2,3,4));
        HashSet<Integer> union = new HashSet<>(s1);
        HashSet<Integer> intersection = new HashSet<>(s1);
        union.addAll(s2);
        intersection.retainAll(s2);

        System.out.println(union);
        System.out.println(intersection);
        Iterator<Integer> itr = s1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        HashSet<Integer> s3 = new HashSet<>(10,7.5f); // after size exceed initial capacity the size increase to initialCapacity*loadFactor


    }
}
