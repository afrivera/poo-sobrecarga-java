package org.afrivera.poosobrecarga;

public class Calculadora {

    // para que no se pueda instanciar la clase se pone el constructor en private
    private Calculadora() {
    }

    // sobrecarga de metodos: deben recibir diferentes parametros
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int... args){
        int lng = args.length;
        int total = 0;
        for (int i = 0; i < lng; i++) {
            total += args[i];
        }
        return total;
    }
    public static float sumar(float a ,int... args){
        int lng = args.length;
        float total = a;
        for (int i = 0; i < lng; i++) {
            total += args[i];
        }
        return total;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int a, float b){
        return a + b;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);

        }catch (NumberFormatException e){
            resultado = 0;
        }

        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}
