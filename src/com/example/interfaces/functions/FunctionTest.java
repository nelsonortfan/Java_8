package com.example.interfaces.functions;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<String, Integer> f1 =  s -> s.length();   // se recibe un String y se retorna un Integer
        System.out.println("Vamos a usar la funcion con la palabra Nelson para ver la longitud:");
        System.out.println(f1.apply("Nelson"));  // se usa el metodo apply() para utilizar la funcion

    }

}
