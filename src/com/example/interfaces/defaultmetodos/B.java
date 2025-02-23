package com.example.interfaces.defaultmetodos;

public class B implements A{

    public void m1() {    // al sobreescribir el metodo se quita la palabra Default y se deja public
        System.out.println("Dentro del metodo de la clase B");
    }
}
