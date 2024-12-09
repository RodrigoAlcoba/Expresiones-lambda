package org.rodrigo.java8.lambda;

import org.rodrigo.java8.lambda.aritmetica.Aritmetica;
import org.rodrigo.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10, 5, resta));
        System.out.println(calculadora.computar(10, 5, suma));
        System.out.println(calculadora.computar(10, 5, (a, b) -> a * b));
        System.out.println(calculadora.computarConBiFunction(10, 5, (a ,b) -> a +b));
    }
}
