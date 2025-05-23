package org.example.OOPS;

// calling method in different way
class Target{
    public static int countObj = 0;

    Target(){
        System.out.println("inside target constructor");
        countObj++;
    }
    void print(){
        System.out.println("inside target class print");
    }
}
public class basicClass {

    public void print(){
        System.out.println("inside print function");
    }

    public static void main(String []args){

//inside same class method
    basicClass b = new basicClass();
    b.print();

//inside other class methods
    Target t = new Target();
    Target t2 = new Target();
    t.print();

    System.out.println("number of target object: " + Target.countObj);
    }
}
