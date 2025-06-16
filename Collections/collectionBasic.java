package org.example.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class sortAll implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a - b;
    }
}

public class collectionBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(2);
        arrlist.add(1);
        System.out.println(arrlist);
        arrlist.add(1,5);
        System.out.println(arrlist);
        ArrayList<Integer> arrl = (ArrayList<Integer>) arrlist.clone();
        arrl.add(1,8);
        System.out.println(arrlist);
        System.out.println(arrlist.indexOf(1));
        Collections.addAll(arrlist, 11,22,33);
        System.out.println(arrlist);
        Collections.sort(arrlist, new sortAll());
        System.out.println(arrlist);
        System.out.println("found at index: "+ Collections.binarySearch(arrlist, 33));
    }
}
