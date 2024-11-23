package controller.ejercicios;

import java.util.Scanner;

import controller.util.Utilidades;

public class Temperatura {
    public float GenerarTemperatura(float min, float max) {
        return Utilidades.generarNumeroRangoFloat(min, max);
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
        do {
            System.out.println("La temperatura generada es: " + GenerarTemperatura(min, max));
            System.out.println("Si desea generar otra temperatura presione s");
        } while (respuesta.equalsIgnoreCase("s"));
    }
}
