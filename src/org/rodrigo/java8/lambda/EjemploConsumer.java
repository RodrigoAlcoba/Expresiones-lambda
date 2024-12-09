package org.rodrigo.java8.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> c = saludo -> System.out.println(saludo);

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años");
        };

        consumidorBi.accept("pepe", 20);


    }
}
