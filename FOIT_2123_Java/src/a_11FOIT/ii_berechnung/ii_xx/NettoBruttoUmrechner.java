package a_11FOIT.ii_berechnung.ii_xx;

import java.util.Scanner;
import java.text.NumberFormat;

public class NettoBruttoUmrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prozent_eingabe;
        double prozent;
        double prozent_umgerechnet;
        double netto;
        double brutto;
        String brutto_formatiert;

        System.out.println("Bitte geben Sie ihren Prozentsatz an: ");
        prozent_eingabe = input.nextDouble();

        System.out.println("Bitte geben Sie ihren Nettobetrag an: ");
        netto = input.nextDouble();

        prozent_umgerechnet = prozent_eingabe / 100;
        prozent = 1 + prozent_umgerechnet;
        brutto = netto * prozent;
        brutto_formatiert = NumberFormat.getCurrencyInstance().format(brutto);

        System.out.println("Der Bruttobetrag beträgt: " + brutto_formatiert);
    }
}
