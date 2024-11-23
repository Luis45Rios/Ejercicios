package controller.ejercicios;

public class Elevado {
    public static Double Potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
