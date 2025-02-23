package com.example.interfaces.funcionales;

public class Test {

    public static void main(String[] args) {

        System.out.println("Sin expresiones Lambda: ");
        A a = new C();
        a.method1();

        System.out.println();

        System.out.println("Con expresiones Lambda");
        A a1 = () -> System.out.println("Usando metodo 1 con expresion Lambda");
        a1.method1();
    }

}
