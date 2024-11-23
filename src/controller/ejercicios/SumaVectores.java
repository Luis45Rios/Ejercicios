package controller.ejercicios;

public class SumaVectores {
    public static boolean esNumeroValido(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int puntos = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                puntos++;
            } else if (!Character.isDigit(c) && c != '-' && c != '.') {
                return false;
            }
        }
        return puntos <= 1 && !(str.startsWith("-") && str.length() == 1);
    }

    public static double convertirADouble(String str) {
        boolean negativo = str.startsWith("-");
        if (negativo) {
            str = str.substring(1);
        }

        double resultado = 0;
        double factorDecimal = 1;
        boolean parteDecimal = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '.') {
                parteDecimal = true;
            } else if (Character.isDigit(c)) {
                int digito = c - '0';
                if (parteDecimal) {
                    factorDecimal /= 10;
                    resultado += digito * factorDecimal;
                } else {
                    resultado = resultado * 10 + digito;
                }
            }
        }

        return negativo ? -resultado : resultado;
    }

    public static double calcularMagnitud(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double calcularAngulo(double x, double y) {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public static double CalcularX(double latitud, double longitud) {
        double latitudRad = Math.toRadians(latitud);
        double longitudRad = Math.toRadians(longitud);
        return Math.cos(latitudRad) * Math.cos(longitudRad);
    }

    public static double CalcularY(double latitud, double longitud) {
        double latitudRad = Math.toRadians(latitud);
        double longitudRad = Math.toRadians(longitud);
        return Math.cos(latitudRad) * Math.sin(longitudRad);
    }
}
