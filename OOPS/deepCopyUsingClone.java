package org.example.OOPS;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    Address(Address other) {
        this.city = other.city;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone(); // shallow, but fine here since only primitive String
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    Person(Person p){ // copy construtor
        this.name = p.name;
        this.address = new Address(p.address);
    }

    public Person clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();      // shallow copy
        cloned.address = this.address.clone();       // deep copy the Address
        return cloned;
    }
}

public class deepCopyUsingClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");
        Person p1 = new Person("Alice", addr);

//        Person p2 = p1.clone(); // deep copy this will trigger clone
        Person p2 = new Person(p1); // this will trigger copy constructor

        p2.name = "Bob";
        p2.address.city = "Mumbai";

        System.out.println(p1.name + " lives in " + p1.address.city); // Delhi or Mumbai?
        System.out.println(p2.name + " lives in " + p2.address.city);
    }
}
