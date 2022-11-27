package a_11FOIT.ii_berechnung.ii_xx;

import java.util.Scanner;
import java.text.NumberFormat;

public class BruttoNettoUmrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prozent_eingabe;
        double prozent;
        double prozent_umgerechnet;
        double netto;
        double brutto;
        String netto_formatiert;

        System.out.println("Bitte geben Sie ihren Prozentsatz an: ");
        prozent_eingabe = input.nextDouble();

        System.out.println("Bitte geben Sie ihren Bruttobetrag an: ");
        brutto = input.nextDouble();

        prozent = 100 - prozent_eingabe;
        prozent_umgerechnet = prozent / 100;
        netto = brutto * prozent_umgerechnet;
        netto_formatiert = NumberFormat.getCurrencyInstance().format(netto);

        System.out.println("Der Nettobetrag beträgt: " + netto_formatiert);
    }
}
