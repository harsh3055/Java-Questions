    //It is the mechanism in java by which one class in allowed to inherit
    //the features of another class.
    //Inheritence is also known as "is-a" relationships

    //superclass: whose features are inherited
    //subclass: class who inherite from superclass
    //resuability: we can inherit if we want a same function from superclass;
package org.example.OOPS;
    // Superclass (Parent)
    class Animal {
        void eat() {
            System.out.println("Animal is eating...");
        }

        void sleep() {
            System.out.println("Animal is sleeping...");
        }
    }

    // Subclass (Child) - Inherits from Animal
    class Dog extends Animal {
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

    }
}
