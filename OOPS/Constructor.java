package org.example.OOPS;

public class Constructor {
        int a;
        String name;
        //default constructor it provide the defult values like 0 or null.
        Constructor(){
            System.out.println("default constructor");
        }
        Constructor(int a, String name){
            this.a = a;
            if (name == null) throw new IllegalArgumentException("Name cannot be null");
            this.name = name;
        }
        Constructor(Constructor c){
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



    public static void main(String[] args) {
        Constructor c = new Constructor(); //default constructor
        System.out.println("Default constructor: " + c.name + c.a); //null,0

        Constructor c1 = new Constructor(27, "harsh"); //paramterized constructor
        System.out.println(c1.toString());

        Constructor c2 = new Constructor(c1); //copy constructor
        System.out.println(c2.toString());

        System.out.println(c1.equals(c2));
    }
}
