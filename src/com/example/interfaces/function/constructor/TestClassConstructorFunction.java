package com.example.interfaces.function.constructor;

public class TestClassConstructorFunction {

    public static void main(String[] args) {

        System.out.println("Primero usando una expresión Lambda:");
        MyInterface f1 = s -> new MyClass(s);
        f1.obtener("Cadena de ejemplo mia Nelson");
        System.out.println();

        System.out.println("Ahora lo haremos usando Constructing Mapping:");
        MyInterface f2 = MyClass::new;
        f2.obtener("Con el Construting Mapping");



    }
}
