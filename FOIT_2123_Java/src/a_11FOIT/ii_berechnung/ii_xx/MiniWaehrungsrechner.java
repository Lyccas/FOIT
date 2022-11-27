package a_11FOIT.ii_berechnung.ii_xx;

import java.util.Scanner;

public class MiniWaehrungsrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double euro;
        double us_dollar;
        double umrechnung;
        System.out.println("Bitte gib einen Euro betrag an: ");
        euro = input.nextDouble();
        umrechnung = 1.33615;
        us_dollar = euro * umrechnung;

        System.out.println("Der Betrag in US-Dollar beträgt: " + us_dollar);
    }
}
