package org.example.OOPS;
import java.util.Scanner;

public class Reflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name (Hello or World): ");
        String className = sc.nextLine();

        try {
            // Step 1: Load class dynamically using inner class reference
            String fullClassName = Reflection.class.getName() + "$" + className;//Reflection$World
            Class<?> clazz = Class.forName(fullClassName);

            // Step 2: Create object using default constructor
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Step 3: Call greet() method
            clazz.getMethod("greet").invoke(obj);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } catch (NoSuchMethodException e) {
            System.out.println("Method greet() not found in class: " + className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Inner class 1
    public static class Hello {
        public void greet() {
            System.out.println("Hello from Hello class!");
        }
    }

    // Inner class 2
    public static class World {
        public void greet() {
            System.out.println("Greetings from World class!");
        }
    }
}