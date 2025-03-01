package com.example.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> vacio = Optional.empty();  //Le asigna un valor de vacio al no tener ningun valor
        System.out.println("Veamos el valor de isPresent en vacio: " + vacio.isPresent());
        Optional<String> datos = Optional.of("Un valor de prueba Nelson cadena");  // Le asigna un valor para indicar que no esta vacio o NULL
        System.out.println();
        System.out.println("Veamos el valor de isPresent en datos: " + datos.isPresent());
        System.out.println();
        // Probando metodo Get()
        if(vacio.isPresent()){ // se debe agregar en este condicion o en caso contrario arroja una excepcion NULL
            System.out.println("Veamos el metodo get en vacio: " + vacio.get());  // No se imprime
        }
        System.out.println("Veamos el metodo get en datos: " + datos.get()); // como tiene data ques el que le dimos en el metodo of, no arroja excepcion NULL

        // Probando metodo Filter

        System.out.println("El valor de Filter para datos es " + datos.filter((s) -> s.equals(("Un valor de prueba Nelson cadena"))));  // Imprime: El valor de Filter para datos es Optional[Un valor de prueba Nelson cadena]

        System.out.println("El valor de Filter para datos es " + datos.filter((s) -> s.equals(("Otro valor de cadena")))); // Imprime: El valor de Filter para datos es Optional.empty

        // Probando el metodo orElse

        System.out.println(datos.orElse("Cadena 1 para datos"));  // Imprime: Un valor de prueba Nelson cadena
        System.out.println(vacio.orElse("Cadena 1 para vacios")); // Imprime: Cadena 1 para vacios

        // Metodo ifPresent

        datos.ifPresent(System.out::println);  // Imprime: Un valor de prueba Nelson cadena
        vacio.ifPresent(System.out::println);  // No imprime nada ya que no ha valores

    }

}
