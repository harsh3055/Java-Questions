package org.example.Basic;

class Address implements Cloneable{
    String city;
    Address(String a){this.city = a;}

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
class Student implements Cloneable{
    String city;
    Address address;
    Student(String name, Address address) {
        this.city = name;
        this.address = address;
    }

    Student(Student other){
        this.city = other.city;
        this.address = new Address(other.address.city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone(); // Shallow copy
        copy.address = address.clone();         // Deep copy of nested object
        return copy;
    }

}

public class deep_and_shallow{
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");

        Student s1 = new Student("Harsh", addr);
        Student s2 = (Student) s1.clone();
        s2.address.city = "Bangalore";

        Student s3 = new Student(s2); // copy constructor doing deep copy
//        Stident s3 = s2; // no copy point to same object
        s3.address.city = "Delhi";


        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
        System.out.println(s3.address.city);
    }
}
