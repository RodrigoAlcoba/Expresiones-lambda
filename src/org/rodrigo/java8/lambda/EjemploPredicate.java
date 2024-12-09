package org.rodrigo.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(10);
        System.out.println(r);

        Predicate<String> test2 = rol -> rol.equals("Admin");
        System.out.println(test2.test("Admin"));

        BiPredicate<String, String> test3 = String::equals;//(a, b) -> a.equals(b);
        System.out.println(test3.test("Admin", "Admin"));

        BiPredicate<Integer, Integer> test4 = (num1, num2) -> num1 > num2;
        boolean r2 = test4.test(1, 2);
        System.out.println(r2);

    }
}
