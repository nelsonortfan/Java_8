package com.example.interfaces.funcionales;

@FunctionalInterface
public interface B extends A {

    void method1();  // solo puede sobreescribir este, no puede agregar mas metodos abstractos
}
