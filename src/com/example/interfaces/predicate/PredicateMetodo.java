package com.example.interfaces.predicate;

import java.util.function.Predicate;

public class PredicateMetodo {

    public static void main(String[] args) {

        int [] x = {2,8,15,23,96,7};

        Predicate<Integer> p1 = i -> i>10;

        System.out.println("Evaluando valores mayores que 10: ");
        method1(p1,x);

    }

    static void method1(Predicate<Integer> p, int[] x){

        for(int eachValue: x){
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }
        }

    }


}
