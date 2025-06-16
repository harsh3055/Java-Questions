package org.example.Strings;

public class stringBuffer {
    public static void main(String []args){
        //String buffer
        StringBuffer s = new StringBuffer();
        s.append("hello");
        s.append(" ");
        s.append("world");

        //convert string buffer into string and assign it to string
        String str3 = s.toString();
        System.out.println(str3);
        s.insert(1,"java");
        s.replace(1,3,"java"); //[1,3)
        s.delete(1,3); //[1,3)
        s.deleteCharAt(7);
        s.reverse();
    }
}
