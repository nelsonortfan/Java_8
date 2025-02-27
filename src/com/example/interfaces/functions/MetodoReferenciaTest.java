package com.example.interfaces.functions;

import java.util.ArrayList;
import java.util.List;

public class MetodoReferenciaTest {

    public static void imprimir(String message){
        System.out.println("Imprimiendo: " +message);
    }

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Marcos");
        lista.add("Mateo");

        System.out.println("Imprimiendo el listado usando el nombre de la clase, metodo estatico y operador ::");
        lista.forEach(MetodoReferenciaTest::imprimir);

    }

}
