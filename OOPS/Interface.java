package org.example.OOPS;
// functional interfaces are SAM interface mean it contains single abstract methods.
interface Vehicles{
    //abstract methods
    void incrementSpeed(int a);
    void decrementSpeed(int a);
    void brake();
    static void display(){
        System.out.println("Inside interface");
    }
}
class cycle implements Vehicles{
    int speed = 0;

    @Override
    public void incrementSpeed(int a) {
        speed += a;
        System.out.println("Current spped of the cycle: " + speed);
    }

    @Override
    public void decrementSpeed(int a) {
        speed -= a;
        System.out.println("Current speed of bycyle: " + speed);
    }

    @Override
    public void brake() {
        System.out.println("Applied brakes");
    }
}

public class Interface{
    public static void main(String[] args) {
        cycle c = new cycle();
        c.incrementSpeed(5);
        c.decrementSpeed(4);
        c.brake();
        Vehicles.display(); // we can call static method of interface like this
        cycle c2 = new cycle(){ //anonymous class
            @Override
            public void brake(){
                System.out.println("applied break in anonymous class");
            }
        };
        c2.brake();
    }
}


