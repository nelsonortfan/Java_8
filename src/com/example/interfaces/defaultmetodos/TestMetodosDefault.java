package com.example.interfaces.defaultmetodos;

public class TestMetodosDefault {

    public static void main(String[] args) {

        System.out.println("Comenzamos usando la Interfaz A con la clase C");

        A a = new C(); // usando directamtente el metodo heredado
        a.m1();

        System.out.println();

        System.out.println("Ahora usando la clase B");
        A a1 = new B();
        a1.m1();

    }

}
