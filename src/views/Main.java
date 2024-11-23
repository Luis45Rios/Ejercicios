package views;

import java.util.Scanner;
import controller.ejercicios.Conteo;
import controller.ejercicios.Elevado;
import controller.ejercicios.Adivinar;
import controller.ejercicios.SumaVectores;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("---------- EJERCICIOS ----------");
        System.out.println("\n ===== MENU =====");
        System.out.println("1. Contar digitos de un numero");
        System.out.println("2. Potencia");
        System.out.println("3. Adivinar la palabra");
        System.out.println("4. Suma de vectores");
        System.out.println("5. SALIR");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("\n----- CONTADOR DE DIGITOS -----");
                System.out.println("Ingrese un numero");
                String num = scanner.nextLine();
                System.out.println("El numero tiene " + Conteo.contar(num) + " digitos");
                break;
            case 2:
                System.out.println("\n----- POTENCIA -----");
                System.out.println("Ingresa la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingresa el exponente:");
                double exponente = scanner.nextDouble();
                System.out.println("El resultado es: " + Elevado.Potencia(base, exponente));
                break;
            case 3:
                System.out.println("\n----- ADIVINAR LA PALABRA -----");

                String palabraAdivinar = "Mesa";
                int maxIntentos = 3;
                boolean adivinada = false;

                System.out.println("Tienes 3 intentos máximos para adivinar la palabra. SUERTE!");
                Adivinar.mostrarPista(palabraAdivinar);

                for (int i = 1; i <= maxIntentos; i++) {
                    System.out.println("Intento " + i);
                    System.out.print("Respuesta: ");
                    String respuesta = scanner.nextLine();

                    if (respuesta.equalsIgnoreCase(palabraAdivinar)) {
                        System.out.println("Has ganado el juego. FELICIDADES!");
                        adivinada = true;
                        break;
                    } else {
                        System.out.println("Has fallado. Sigue intentandolo");
                    }
                }
                if (!adivinada)
                System.out.println("Lo siento se te acabaron los intentos");
                System.out.println("La palabra era: " + palabraAdivinar);
                break;
            case 4:
                System.out.println("\n----- SUMA DE N VECTORES -----");

                double sumX = 0; 
                double sumY = 0; 
                String continuar;

                do {
                    double latitud = 0;
                    double longitud = 0;
                    boolean entradaValida;

                    do {
                        System.out.println("Ingrese la latitud en grados:");
                        String entradaLatitud = scanner.nextLine();
                        entradaValida = SumaVectores.esNumeroValido(entradaLatitud);
                        if (entradaValida) {
                            latitud = SumaVectores.convertirADouble(entradaLatitud);
                        } else {
                            System.out
                                    .println("Entrada no válida. Por favor, ingrese un número válido para la latitud.");
                        }
                    } while (!entradaValida);

                    do {
                        System.out.println("Ingrese la longitud en grados:");
                        String entradaLongitud = scanner.nextLine();
                        entradaValida = SumaVectores.esNumeroValido(entradaLongitud);
                        if (entradaValida) {
                            longitud = SumaVectores.convertirADouble(entradaLongitud);
                        } else {
                            System.out.println(
                                    "Entrada no válida. Por favor, ingrese un número válido para la longitud.");
                        }
                    } while (!entradaValida);

                    System.out.println("Coordenadas polares:");
                    double magnitud = SumaVectores.calcularMagnitud(latitud, longitud);
                    double angulo = SumaVectores.calcularAngulo(longitud, latitud);

                    System.out.println("Magnitud: " + (int) magnitud + " unidades");
                    System.out.println("Ángulo: " + (int) angulo + " grados");

                    double x = SumaVectores.CalcularX(latitud, longitud);
                    double y = SumaVectores.CalcularY(latitud, longitud);

                    sumX += x;
                    sumY += y;

                    System.out.println("¿Desea ingresar otro vector? (si/no):");
                    continuar = scanner.nextLine().trim();
                } while (continuar.equalsIgnoreCase("si"));

                System.out.println("Resultado de la suma de vectores:");
                double magnitudTotal = SumaVectores.calcularMagnitud(sumX, sumY);
                double anguloTotal = SumaVectores.calcularAngulo(sumX, sumY);

                System.out.println("Coordenadas polares:");
                System.out.println("Magnitud: " + (int) magnitudTotal + " unidades");
                System.out.println("Ángulo: " + (int) anguloTotal + " grados");

                System.out.println("Coordenadas rectangulares:");
                System.out.println("X: " + sumX);
                System.out.println("Y: " + sumY);
                break;
            case 5:
                System.out.println("\nGracias por usar el sistema :)");
                break;
        
            default:
                System.out.println("Ingrese una opcion valida!");
                break;
        }
    }
}
