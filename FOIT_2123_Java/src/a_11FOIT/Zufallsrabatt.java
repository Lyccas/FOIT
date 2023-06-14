package a_11FOIT;

import java.text.NumberFormat;
import java.util.Scanner;

public class Zufallsrabatt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rechungswert;
        int gutscheinnummer;

        System.out.print("Bitte geben Sie ihren Rechnungswert ein: ");
        rechungswert = input.nextDouble();

        if (rechungswert < 100) {
            System.out.println("Sie bekommen leider keinen Rabattcode, da Sie nicht für einen Mindestbetrag von 100€ eingekauft haben!");
        } else {
            System.out.print("Bitte geben Sie ihre Gutscheinnummer ein: ");
            gutscheinnummer = input.nextInt();
            if ((gutscheinnummer % 7) == 0) {
                System.out.println("Glückwunsch Sie haben einen Rabatt von 15% erhalten, ihr neuer Rechnungswert beträgt: " + NumberFormat.getCurrencyInstance().format(rechungswert * 0.85));
            } else {
                System.out.println("Leider hatten Sie keinen Glück bei ihrer Gutscheinnummer!");
            }
        }
    }
}