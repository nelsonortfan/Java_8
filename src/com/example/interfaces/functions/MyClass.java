package com.example.interfaces.functions;

public class MyClass {

    /*
    El metodo no necesita tener el mismo nombre de la interfaz pero si el mismo tipo de argumentos de entrada
     */
    public void myMethod123(int i){
        System.out.println("El doble de " + i + " es " + 2*i);
    }

    public static void main(String[] args) {

        MyInterface f = i -> System.out.println("El valor ingresado es: " + i);
        System.out.println("Usando la interfaz usando expresiones Lambda:");
        f.myMethod(14);

        System.out.println("Usando la interfaz con el operador :: y un metodo de instancia:");
        MyClass c = new MyClass(); // Se instancia la clase para poder tener acceso al metodo creado
        MyInterface f1 = c::myMethod123;  //Con el :: se le asigna el metodo de instancia de esta clase
        f1.myMethod(20);

    }

}
