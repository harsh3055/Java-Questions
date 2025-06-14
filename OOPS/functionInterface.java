//functional interface are those interface which only contains one abstract method
//types of function interfaces are:
//consumer: one argumnent and no return type accpet
//predicate: single argument and return boolean value test
//function: one argument and return something after processing apply
//supplier: do not take input but return something get
package org.example.OOPS;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class functionInterface {
    public static void main(String[] args) {
        List<String> stri = Arrays.asList("harsh", "hellow", "dudu", "bubu");

        // 1. Consumer: one argument, returns nothing
        Consumer<String> consumer = s -> System.out.println("Consuming: " + s);
        System.out.println("\nConsumer output:");
        for (String str : stri) {
            consumer.accept(str);
        }

        // 2. Predicate: one argument, returns boolean
        Predicate<String> p = s -> s.startsWith("h");
        System.out.println("Strings starting with 'h':");
        for (String str : stri) {
            if (p.test(str)) {
                System.out.println(str);
            }
        }


        // 3. Function: one argument, returns processed value
        Function<String, Integer> function = s -> s.length();
        System.out.println("\nFunction output (String lengths):");
        for (String str : stri) {
            System.out.println("Length of " + str + ": " + function.apply(str));
        }

        // 4. Supplier: no input, returns something
        Supplier<String> supplier = () -> "I'm a supplied string!";
        System.out.println("\nSupplier output:");
        System.out.println(supplier.get());

        Integer first = 7;
        Integer second = 4;

        BiPredicate<Integer,Integer> function2 = (a,b) -> a > b;
        System.out.println(function2.test(first,second));
    }
}
