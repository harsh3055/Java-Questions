    //It is the mechanism in java by which one class in allowed to inherit the features of another class.
    //Inheritence is also known as "is-a" relationships

    //superclass: whose features are inherited
    //subclass: class who inherits from superclass
    //resuability: we can inherit if we want a same function from superclass;
    //super in Java refers to the immediate parent class object.
    //It is mainly used for:
        //Calling parent constructor
        //Accessing parent variables
        //Calling parent methods
package org.example.OOPS;
    // Superclass (Parent)
    class Animal {

        Animal(){
            System.out.println("Animal C");
        }

        void eat() {
            System.out.println("Animal is eating...");
        }

        void sleep() {
            System.out.println("Animal is sleeping...");
        }
    }

    // Subclass (Child) - Inherits from Animal
    class Dog extends Animal {

        //super(); automatically insert parent construtor in inheritence
        Dog(){
            System.out.println("Dog c");
        }

        @Override
        void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        void sleep() {
            System.out.println("Dog is sleeping");
        }

        void bark() {
            System.out.println("Dog is barking!");
        }
    }
public class Inheritence {
    public static void main(String[] args){
        Dog myDog = new Dog();

        myDog.eat();
        myDog.sleep();
        myDog.bark();

        Animal an = new Dog();
        an.eat();// Parent -> child constructor

    }
}
