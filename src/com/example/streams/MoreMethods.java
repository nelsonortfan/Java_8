package com.example.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoreMethods {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i= 0; i <20; i++){
            l1.add(i);
        }

        System.out.println("Ahora usaremos Streams de la Collection ");  // Stream viene en las collections, en este caso en List

        List<Integer> l3 = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("El resultado usando Streams es:");
        System.out.println(l3);

        long count = l1.stream().filter(i -> i%2 == 0).count();
        System.out.println("La cantidad de numeros pares es " + count);

        Comparator<Integer> comp = (i1, i2) ->i1.compareTo(i2);

        List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(" El arreglo ordenado es " + l4);

        Integer max = l1.stream().max(comp).get();
        System.out.println("El valor maximo es " + max);

        Integer min = l1.stream().min(comp).get();
        System.out.println("El valor minimo es " + min);

        l1.stream().forEach(i -> System.out.println("El doble del valor de " + i + " es " + 2*i));



    }

}
