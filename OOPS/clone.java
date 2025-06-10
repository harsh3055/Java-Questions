package org.example.OOPS;

public class clone implements Cloneable{
    @Override
    protected clone clone() throws CloneNotSupportedException {
        return (clone) super.clone();
    }
    String name = "harsh";

    public static void main(String[]args){
        clone c1 = new clone();
        try {
            clone c2 = (clone)c1.clone();

            System.out.println(c2.name + c1.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
