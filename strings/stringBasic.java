package org.example.strings;
//string is a type of object that can store a sequence of characters
//every character is stored in 16 bits i.e, UTF 16-bit
//string is immutable and can not be changed
public class stringBasic {
    public static void main(String[] args){ // if you want to pass something in cli while running java file it will go in args
        String str = new String("Harsh");
        System.out.println(str);
//string buffer:- it is mutable in nature and it is thread safe class
//we can use it in multi threaded envirnoment
        StringBuffer demoString = new StringBuffer("harsh2");
        System.out.println(demoString);
//string builder:-  it is used in alternative to string and string buffer
//it is not thread safe so it is used within the thread
        StringBuilder demoString1 = new StringBuilder("harsh3");
        demoString1.append("harsh");
        System.out.println(demoString1);
//string tokenizer:= is used to break strig into tokens
//to prove string is immutable
        str.concat("goswami");
        System.out.println(str);//it will print harsh
        str = str.concat(" goswami");
        System.out.println(str); //now it will print harsh goswami
    //heap has heap memory and string constant pool
//if we create string with literals it will be saved in string constand pool
//if we create a new object than it will be saved in new memory add in heap
    char characters[] = {'h','a','r','s','h'};
    String firstString = new String(characters);
    String secondString = new String(firstString);
        System.out.println(firstString + secondString);

        //reverse a string
        String org = "harsh";
        String rev = "";
        for(int i = org.length()-1;i>=0;i--){
            char ch = org.charAt(i);
            String r = Character.toString(ch);
            rev = rev.concat(r);

        }
        System.out.println(org +" "+ rev);
    }
}
