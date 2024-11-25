package controller.ejercicios;

import java.util.Scanner;

import controller.util.Utilidades;

public class Secuencia {
    // public int terminosGenerados(int terminos) {
    //     int numerador = 1;
    //     int denominador = 0;
    //     for (int i = 1; i <= terminos; i++) {
    //         numerador = (2 * i - 1);
    //         denominador = numerador * 3;
    //         // System.out.print(numerador + "/" + denominador + ", ");
    //     }
    //     return denominador;
    // }

    // public int fibonacciGenerador(int terminos) {
    //     int a = 0;
    //     int b = 1;
    //     for (int i = 0; i <= terminos; i++) {
    //         System.out.print(a + " ");
    //         int temp = a + b;
    //         a = b;
    //         b = temp;
    //     }
    //     return b;
    // }

    // public static int signosStrings(int terminos) {
    //     char respuesta = ' ';
    //     char signoPositivo = '+'; 
    //     char signoNegativo = '-';
    //     int cont = 0;
    //     for (int i = 0; i <= 3; i++) {
    //         if (i <=2) {
    //             respuesta = signoNegativo;
    //             cont = 0;
    //         } else {
    //             respuesta = signoPositivo;
    //         }
    //         cont++;
    //     }
    //     return respuesta;
    // }
    // public String presentarEcuacion(String ecuacion) {
    //     ecuacion = Secuencia.signosStrings(9) + "("+ terminosGenerados(9) + ")"+  fibonacciGenerador(9);
    //     return ecuacion;
    // }

    private int generarImpar(int numero) {
        int resultado = 1;
        if (numero > 1) {
            for (int i = 0; i < numero; i++) {
                resultado += 2;
            }
        return resultado;
        }
    }

    private int generarNumero(int numero) {
        return numero * 3;
    }

    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos de la serie");
        String numero = scanner.nextLine();
        int numSerie = Utilidades.transformStringToInt(numero);
        String serie = "";
        int signo = 2;
        if (numSerie > 0) {
            for (int i = 0; i < numSerie; i++) {
                int impar = generarImpar(i + 1);
                int mult3 = generarNumero(impar);
                if (signo == 3) {
                    serie += "(" + impar + "/" + mult3 + ")";
                } else {
                    serie += "(" + impar + "/" + mult3 + ")";
                }
            }
        }


        int impar = generarImpar(4);
        int numero = generarNumero(impar);
        System.out.println(impar + " " + numero);
    }

}