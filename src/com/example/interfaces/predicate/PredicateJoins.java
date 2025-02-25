package com.example.interfaces.predicate;

import java.util.function.Predicate;

public class PredicateJoins {

    public static void main(String[] args) {

        int [] x = {0,2,7,12,16,20,23,45,56,78,91};

        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i%2 == 0;

        System.out.println("Mayor que 10 y par:");
        method1(p1.and(p2),x);

        System.out.println("impares:");
        method1(p2.negate(),x);

        System.out.println("Mayor que 10 o par:");
        method1(p1.or(p2),x);

    }

    static void method1(Predicate<Integer> p, int[] x){
        for(int eachValue: x){
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }
        }
    }


}
