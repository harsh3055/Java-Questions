package org.example.OOPS;
// Java Program to Demonstrate
// Method Overloading and Overriding

// Parent Class

//Dynamic Method Dispatch is the process where an overridden
// method call is resolved at runtime based on the actual object type rather than the reference type.
// it does not work on static method because they have early binding. private methods final methods constructors

//Dynamic dispatch in C++ is achieved using virtual functions, where the function call is
//resolved at runtime through vtables and vptrs based on the actual object type.

class Parent {
    // Overloaded method (compile-time polymorphism)
       void func() {
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
//    @Override
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
        //in cpp vptr -----> child vtable
        //                    |
        //                    ---> child::func()

        //method overloading
        parent.func();
        parent.func(20);

        //method overriding
        child.func(30);

        //polymorphism in action
        polymorphicObj.func(40); //dynamic dispath, reference type is parent, object type is child


    }
}
