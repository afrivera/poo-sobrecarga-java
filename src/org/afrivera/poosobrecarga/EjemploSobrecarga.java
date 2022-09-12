package org.afrivera.poosobrecarga;

import static org.afrivera.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10.0f, 5f));
        System.out.println("sumar float-int: " + sumar(10.0f, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0f));
        System.out.println("sumar double: " + sumar(10d, 5.0d));
        System.out.println("sumar String: " + sumar("10", "5"));
        System.out.println("sumar 3 enteros: " + sumar(10, 5, 3));
        System.out.println("sumar n enteros: " + sumar(10, 5, 3, 4));
        System.out.println("sumar n enteros: " + sumar(10, 5, 3, 4, 5, 6));
        System.out.println("sumar n float: " + sumar(10f, 5, 3, 4, 5, 6));

        System.out.println("sumar long: " + sumar(10l, 5l));

        System.out.println("sumar int: " + sumar(10, '@'));// en decimal el arroba es 64
    }
}
