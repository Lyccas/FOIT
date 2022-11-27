package b_12FOIT.ii.ii_xxxxx.umrechner;

import java.text.NumberFormat;

public class Umrechner {
    public static String meldungPoOderNe(int zahl) {
        if (zahl > 0) {
            return "Positiv";
        } else if (zahl < 0) {
            return "Negativ";
        } else {
            return "Neutral";
        }
    }

    public static int multiplizieren(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    public static String addieren(double zahl1, double zahl2) {
        return String.valueOf(Math.round((zahl1 + zahl2) * 100.0 ) / 100.0);
    }

    public static String zahlInEuro(double zahl) {
        return NumberFormat.getCurrencyInstance().format(zahl);
    }

    public static double wurzelZiehen(int zahl) {
        return Math.sqrt(zahl);
    }

    public static double wurzelZiehen(int zahl, int wurzel) {
        return Math.pow(zahl, (1.0/wurzel));
    }

    public static int potenzieren(int zahl, int potenzzahl) {
        return (int) Math.pow(zahl, potenzzahl);
    }

    public static String teilermengeAusgaben(int zahl) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < zahl ; i++) {
            if ((zahl % i) == 0) {
                str.append(i).append(", ");
            }
        }
        str.append(zahl);

        return str.toString();
    }

    public static String dezimalNachBinaer(int zahl) {
        StringBuilder str = new StringBuilder();
        do {
            str.append(zahl % 2);
            zahl = zahl / 2;
        } while (zahl > 0);
        return str.reverse().toString();
    }
}
