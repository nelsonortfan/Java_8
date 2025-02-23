package com.example.interfaces.funcionales2.suma;

public class TestSuma {

    public static void main(String[] args) {

        Suma s = (x,y) -> x+y;  // implementa el retorno directamente

        int numero1 = 8;
        int numero2 = 9;
        int total = s.add(numero1, numero2);
        System.out.println("El resultado de la suma entre " + numero1 + " y " + numero2 + " es "
        + total );

    }

}
