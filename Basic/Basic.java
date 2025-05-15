package org.example.Basic;

public class Basic {
    public static void main(String args[]){
        //primitive date types
        boolean b = true; // 1 byte, 8 bits
        System.out.println("boolean: " + b);
        byte a = 25; // 1 byte, 8 bits
        System.out.println("byte: " + a);
        short s = 1000; //2 bytes 16 bits
        System.out.println("short: " + s);
        int p = 2000000; //4bytes 32bits
        System.out.println("int: "+ p);
        long l = 780000000000L;
        System.out.println("long: " + l);
        float f = 3.14f;//4 bytes 32 bits
        System.out.println("float: "+ f);
        double d = 3.141492653589793;//8 bytes 64 bits
        System.out.println("double: "+ d);
        char c = 'A'; //2 bytes, 16 bits becuase unlike ascii it supoorts unicode
        System.out.println("char: "+c);
        //non-primitive data types
        String str = "Harsh";
        System.out.println("string: "+ str);

    }
}
