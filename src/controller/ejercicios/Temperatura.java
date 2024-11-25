package controller.ejercicios;

import java.util.Scanner;

import controller.util.Utilidades;

public class Temperatura {
    public float GenerarTemperatura(float min, float max) {
        temp = Utilidades.generarNumeroRangoFloat(min, max);
    }

    public void ejecutar() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el rango minimo de la temperatura:");
        String minimo = scanner.nextLine();
        float min = Utilidades.transformStringToFloat(minimo);
        System.out.println("Ingrese el rango maximo de la temperatura:");
        String maximo = scanner.nextLine();
        float max = Utilidades.transformStringToFloat(maximo);
        String respuesta = "s";
        int cont = 1;
        float promedio = 0.0f;
        do {
            float temp = GenerarTemperatura(min, max);
            cont++;
            System.out.println("La temperatura generada es: " + temp);
            System.out.println("Si desea generar otra temperatura presione s");
        } while (respuesta.equalsIgnoreCase("s")
        System.out.println("Fueron generados " + cont + " temperaturas y el primedio es: " + Utilidades.redondear(promedio/cont));
        );
    }
}
