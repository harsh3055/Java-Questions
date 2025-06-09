package org.example.OOPS;
// Java Program to Demonstrate
// Method Overloading and Overriding

// Parent Class
class Parent {
    // Overloaded method (compile-time polymorphism)
    public void func() {
        System.out.println("Parent.func()");
    }

    // Overloaded method (same name, different parameter)
    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

// Child Class
class Child extends Parent {
    // Overrides Parent.func(int) (runtime polymorphism)
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();
        //dynamic dispatch
        Parent polymorphicObj = new Child();

        //method overloading
        parent.func();
        parent.func(20);

        //method overriding
        child.func(30);

        //polymorphism in action
        polymorphicObj.func(40);

    }
}
