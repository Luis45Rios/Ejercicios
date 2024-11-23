package controller.ejercicios;
import controller.util.Utilidades;

public class Conteo {
    public static int contar(String num) {
        int cont = 0;
        if (Utilidades.validate(num)) {
            for (int i = 0; i < num.length(); i++) {
                if (Character.isDigit(num.charAt(i)))
                    cont++;
            }
        }
        return cont;
    }
}
