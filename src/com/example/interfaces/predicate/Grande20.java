package com.example.interfaces.predicate;

import java.util.function.Predicate;

public class Grande20 {

    public static void main(String[] args) {

        Predicate<Integer> p = i -> (i > 20);

        Predicate<String> p2 = s -> (s.length() > 5);

        System.out.println();
        System.out.println("Para el numero 15 vemos que la condicion es " + p.test(15));
        System.out.println("Para el numero 20 vemos que la condicion es " + p.test(20));
        System.out.println("Para el numero 50 vemos que la condicion es " + p.test(50));
        System.out.println();
        System.out.println("La palabra Avion tiene más de 5 caracteres? : " + p2.test("Avion") );
        System.out.println("La palabra Computador tiene más de 5 caracteres? : " + p2.test("Computador"));

    }

}
