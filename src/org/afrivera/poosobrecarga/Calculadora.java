package org.afrivera.poosobrecarga;

public class Calculadora {

    // sobrecarga de metodos: deben recibir diferentes parametros
    public int sumar(int a, int b){
        return a + b;
    }

    public int sumar(int... args){
        int lng = args.length;
        int total = 0;
        for (int i = 0; i < lng; i++) {
            total += args[i];
        }
        return total;
    }
    public float sumar(float a ,int... args){
        int lng = args.length;
        float total = a;
        for (int i = 0; i < lng; i++) {
            total += args[i];
        }
        return total;
    }

    public float sumar(float a, float b){
        return a + b;
    }

    public float sumar(int a, float b){
        return a + b;
    }

    public float sumar(float a, int b){
        return a + b;
    }

    public double sumar(double a, double b){
        return a + b;
    }

    public int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);

        }catch (NumberFormatException e){
            resultado = 0;
        }

        return resultado;
    }

    public int sumar(int a, int b, int c){
        return a + b + c;
    }
}
