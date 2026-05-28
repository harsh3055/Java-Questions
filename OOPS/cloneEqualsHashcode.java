package org.example.OOPS;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class cloneEqualsHashcode implements Cloneable{
    private String name;
    private String last_name;
    private int roll_no;

    public cloneEqualsHashcode(String name,String last_name,int roll_no){
        this.name = name;
        this.last_name = last_name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "cloneEqualsHashcode{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
    @Override public boolean equals(Object o){
        if(o == null || !(o instanceof cloneEqualsHashcode)) return false;
        cloneEqualsHashcode other = (cloneEqualsHashcode) o;
        return (this.name.equals(other.name) && this.last_name.equals(other.last_name) && this.roll_no == other.roll_no);
    }
    @Override public cloneEqualsHashcode clone() throws CloneNotSupportedException{
        return (cloneEqualsHashcode) super.clone();
    }
//    @Override public int hashCode(){
//        int res = 31;
//        res += (int) (31 * this.roll_no +
//                        31 * this.name.hashCode() +
//                        31 * this.last_name.hashCode() + Math.random() * 2);
//        return res;
//    }
    @Override
    public int hashCode() {
        return Objects.hash(name, last_name, roll_no);
    }
    @Override protected void finalize(){ // deprecated in java 9 and disabled in java 18
        System.out.println("Object is getting destroyed");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        cloneEqualsHashcode obj1 = new cloneEqualsHashcode("harsh", "goswami", 27);
        System.out.println(obj1);
        cloneEqualsHashcode obj2 = obj1.clone();
        System.out.println(obj2);
        System.out.println("obj hashcode: " + obj1.hashCode());
        System.out.println("obj2 hashcode: " + obj2.hashCode());


        Map<cloneEqualsHashcode, Integer> mp = new HashMap<>();
        mp.put(obj1, obj1.roll_no); //map will called the hashmap function at the time of insertion also 
        mp.put(obj2, obj2.roll_no);
        System.out.println("size of the map" + mp.size()); // map size depends upon the hashcode random function

        System.out.println(obj1.equals(obj2));
        obj1 = null;
        obj2 = null;
        System.gc(); // call overridden finalize method
    }
}
