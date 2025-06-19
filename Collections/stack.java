package org.example.Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        st.add(1,4);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.remove(1));
        System.out.println(st.pop());
        System.out.println(st.empty());
        System.out.println(st.search(1));
        System.out.println(st);

    }
}
