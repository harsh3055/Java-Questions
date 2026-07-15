package org.example.OOPS;

// super() and this() can not be used in same constructor and both should always be on first line
public class Constructor implements Cloneable{
        int a;
        String name;
        //default constructor it provide the defult values like 0 or null.
        Constructor(){
            System.out.println("default constructor");
        }
        Constructor(int a, String name){ // parametrized constructor
            this(a); // while doing chaining always call it first
            this.a = a;
            if (name == null) throw new IllegalArgumentException("Name cannot be null");
            this.name = name;

        }
        Constructor(int a){System.out.println("Constructor chaining: " + a);}

        Constructor(Constructor c){ //copy constructor
            this.a = c.a;
            this.name = c.name;
        }

    @Override
    public String toString() {
        return "Constructor{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
//    @Override // it is deperected in java 9 and disabled in java 18
//    protected void finalize() throws Throwable {
//        System.out.println("Object is being finalized");
//        super.finalize();
//    }
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Constructor)) return false;
        Constructor other = (Constructor) o;
        return this.a == other.a && this.name.equals(other.name);
    }
    @Override
    public Constructor clone() {
        try {
            Constructor copy = (Constructor) super.clone();
            copy.name = new String(this.name); // defensive copy
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }finally { //even though you are retuning in try finally still will run;
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(); //default constructor
        System.out.println("Default constructor: " + c.name + c.a); //null,0

        Constructor c1 = new Constructor(27, "harsh"); //paramterized constructor
        System.out.println(c1.toString());

        Constructor c2 = new Constructor(c1); //copy constructor
        Constructor c3 = c2.clone(); //deep copy
//        c1.name = "tingi";
//        c2.name = "hello";
//        c3.name = "vii";
        System.out.println(c1.name.equals(c2.name));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println(c1.equals(c2));
    }
}

