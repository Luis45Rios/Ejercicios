package controller.ejercicios;

import java.util.Scanner;

import controller.util.Utilidades;

public class SuperMercado {
    public float descuento(float total, int numero) {
        float descuento = 0.0f;
        if (numero > 50 && numero < 100) {
            descuento = total * 0.15f;
        } else if (numero >= 100) {
            descuento = total * 0.2f;
        }
        return descuento;
    }
    public void ejecutar () {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el monto de su compra");
        String numero = scanner.nextLine();
        float total = Utilidades.transformStringToFloat(numero);
        int aleatorio = (int) (Math.random()*100);
        System.out.println("Su numero de la suerte es: " + aleatorio);
        float descuento = descuento(total, aleatorio);
        System.out.println("SU VALOR A PAGAR ES:" + (total - descuento) + " Y EL DESCUENTO ES: " + descuento);
    }
}