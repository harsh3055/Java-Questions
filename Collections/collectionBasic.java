package org.example.Collections;
import java.util.ArrayList;
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
    }
}
