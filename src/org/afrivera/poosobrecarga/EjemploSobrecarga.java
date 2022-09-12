package org.afrivera.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("sumar int: " + cal.sumar(10, 5));
        System.out.println("sumar float: " + cal.sumar(10.0f, 5f));
        System.out.println("sumar float-int: " + cal.sumar(10.0f, 5));
        System.out.println("sumar int-float: " + cal.sumar(10, 5.0f));
        System.out.println("sumar double: " + cal.sumar(10d, 5.0d));
        System.out.println("sumar String: " + cal.sumar("10", "5"));
        System.out.println("sumar 3 enteros: " + cal.sumar(10, 5, 3));
        System.out.println("sumar n enteros: " + cal.sumar(10, 5, 3, 4));
        System.out.println("sumar n enteros: " + cal.sumar(10, 5, 3, 4, 5, 6));
        System.out.println("sumar n float: " + cal.sumar(10f, 5, 3, 4, 5, 6));

        System.out.println("sumar long: " + cal.sumar(10l, 5l));

        System.out.println("sumar int: " + cal.sumar(10, '@'));// en decimal el arroba es 64
    }
}
