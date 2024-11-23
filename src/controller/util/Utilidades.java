package controller.util;

import java.util.Random;

public class Utilidades {
    public static boolean validate (String num) {
        if (num == null || num.isEmpty()) {
            return false;
        }

        boolean band = true;

        if (num.charAt(0) == '-') {
            // num = num.substring(0);
            num = num.substring(1);
        }
        int cont = 0;
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i)) && num.charAt(i) != '.') {
                band = false;
                break;
            } else if (num.charAt(i) == '.') {
                cont++;
            }
        }
        if (cont >= 2)
        band = false;
        return band;
    }

    public static int transformStringToInt (String num) {
        int resp = 0;
        if (Utilidades.validate(num)) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }

    public static Double transformStringToDouble(String num) {
        double resp = 0;
        if (Utilidades.validate(num)) {
            resp = Double.parseDouble(num);
        }
        return resp;
    }

    public static Float transformStringToFloat(String num) {
        float resp = 0;
        if (Utilidades.validate(num)) {
            resp = Float.parseFloat(num);
        }
        return resp;
    }

    public static int GrenerarNumRango(int minimo, int maximo) {
        Random random = new Random();
        // 2 - 10
        // 2 + 11 - 2  ---------- 2 + (9)
        return minimo + random.nextInt((maximo + 1) - minimo);
    }

    public static float generarNumeroRangoFloat(float minimo, float maximo) {
        Random random = new Random();
        return minimo + random.nextFloat() * (maximo - minimo);
    }
}
