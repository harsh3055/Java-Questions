//OOOPs allows developers to structure code using
//classes and objects making it more modular, reusable and scalable
//java strictly follows the DRY(Don't repeat yourself) principle

//public: access anywhere
//private:  access within the same class
//protected: access within the same package and subclasses
//default: within the same package
package org.example.OOPS;

class tempOuter{
    public void print(){
        System.out.println("inside the temp outer");
    }
}

public class oopsBasic {

    class Hello{
        public void print(){
            System.out.println("inside the hello class");
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "oopsBasic{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    private int a;
    private int b;

    public static void main(String[] args){
        oopsBasic outer = new oopsBasic();
        oopsBasic.Hello obj = outer.new Hello();
        obj.print();

        tempOuter obj2 = new tempOuter();
        obj2.print();

        outer.a = 5;
        outer.b = 7;
        System.out.println(outer.toString());
    }
}
