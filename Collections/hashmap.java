package org.example.Collections;
import java.util.HashMap;
import java.util.Map;
// map interface is implemented by three interfaces in java
// hashmap no order maintained
// treemap insertion order maintained
//linkedhashmap sort on the basis of keys
public class hashmap {

    public static void main(String[] args) {

        // Create a Map using HashMap
        Map<String, Integer> m = new HashMap<>();

        // Adding key-value pairs to the map
        m.put("Geek1", 1);
        m.put("Geek2", 2);
        m.put("Geek3", 3);
        Map<Character, Integer> mc = new HashMap<>();
        System.out.println("Map elements: " + m);
        System.out.println(m.getOrDefault(4, 0));
    }
}
