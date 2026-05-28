package org.example.maps;
import com.sun.source.tree.Tree;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// map interface is implemented by three interfaces in java
// hashmap-> no order maintained
// treemap-> sort on the basis of keys
// linkedhashmap->  insetion order maintained
public class hashmap {

    public static void main(String[] args) {

        // Create a Map using HashMap
        Map<Integer, Integer> m = new TreeMap<>();

        // Adding key-value pairs to the map
        m.put(5, 4);
        m.put(8, 2);
        m.put(7, 3);
        Map<Character, Integer> mc = new HashMap<>();
        System.out.println("Map elements: " + m);
        System.out.println(m.getOrDefault(1, 0));

        for(Map.Entry mapElement: m.entrySet()){
            int key  = (int)mapElement.getKey();
            int value = (int)mapElement.getValue();
            System.out.println(key + " " + value);
        }
    }
}
