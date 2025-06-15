package org.example.OOPS;
interface first{
    interface second{ // can be private public default(package private)
        void display();
    }
}
public class nestedInterface implements first.second{
    public void display(){
        System.out.println("inside display");
    };
    public static void main(String[] args) {
        first.second obj;
        obj = new nestedInterface();
        obj.display();
    }
    //marker interface are those interface which are used as marker for some special class cloneable serializable
}
