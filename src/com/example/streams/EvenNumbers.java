package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();

        for(int i= 0; i <20; i++){
            l1.add(i);
        }

        System.out.println();
        System.out.println("Vamos a usar el metodo tradicional para validar numeros pares:");
        List<Integer> l2 = new ArrayList<>();
        for(Integer i : l1){
            if(i%2 == 0){
                l2.add(i);
            }
        }
        System.out.println(("Los valores enteros con el metodo tradicional son: "));
        System.out.println(l2);
        System.out.println();

        System.out.println("Ahora usaremos Streams de la Collection ");  // Stream viene en las collections, en este caso en List

        List<Integer> l3 = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("El resultado usando Streams es:");
        System.out.println(l3);

    }

}
