package org.example.Basic;

public class dataTypes {
    public static void main(String args[]){
        //primitive date types
        boolean b = true; // 1 byte, 8 bits
        System.out.println("boolean: " + b);
        byte a = 25; // 1 byte, 8 bits
        System.out.println("byte: " + a);
        short s = 1000; //2 bytes 16 bits
        System.out.println("short: " + s);
        int p = 2000000; //4bytes 32bits
        System.out.println("int: "+ p);
        long l = 780000000000L;
        System.out.println("long: " + l);
        float f = 3.14f;//4 bytes 32 bits
        System.out.println("float: "+ f);
        double d = 3.141492653589793;//8 bytes 64 bits
        System.out.println("double: "+ d);
        char c = 'A'; //2 bytes, 16 bits becuase unlike ascii it supoorts unicode
        System.out.println("char: "+c);
        //non-primitive data type
//string
        String str = "Harsh";
        System.out.println("string: "+ str);
//class
        class Car{
            String model;
            int year;

            Car(String model, int year){
                this.model = model;
                this.year = year;
            }
            void display(){
                System.out.println("Class" + model + " " + year);
            }
        }

        Car mycar = new Car("Toyato", 1111);
        mycar.display();
//interface
        interface Animal {
            void sound();
        }
        class Dog implements Animal{
            public void sound() {
                System.out.println("bark");
            }
        }
        Dog dog = new Dog();
        dog.sound();
//array
    int num[] = {1,2,3,4,5};
    String str2[] = {"harsh", "urvashi"};

        System.out.println("first number: " + num[0]);
        System.out.println("first name: " + num[0]);
    }
}
