package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("LUCAS");
        l1.add("MATEO");
        l1.add("JUAN");
        l1.add("MARCOS");

        System.out.println("El valor del arreglo inicial es " + l1);

        System.out.println("Ahora usaremos Streams para pasar a minusculas");
        List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println("El valor convertido a minusculas es " + l2);

        /*
        Los Streams se componen de 2 elementos:

        1. Configuracion: Puede ser el uso de:

             1.1   filter(Predicate<T> p)
             1.2   map(Function f)

        2. Procesamiento: Puede ser el uso de:

            2.1 collect(), count(), max(), min(), sorted(), etc
         */


    }

}
