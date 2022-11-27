package a_11FOIT.iii_bedingungen.iii_xx;

import java.util.Scanner;

public class Waehrungsrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double betrag;
        int waehrung;
        double umrechnung;

        System.out.println("Bitte geben Sie den Euro-Betrag an: ");
        betrag = input.nextDouble();

        System.out.println("Bitte wählen Sie die Währung! Tippen Sie");
        System.out.println("1 für US-Dollar,");
        System.out.println("2 für Britische Pfund,");
        System.out.println("3 für Australischer Dollar sowie");
        System.out.println("4 für Japanischer Jen ein.");
        System.out.println("Ihre Auswahl: ");
        waehrung = input.nextInt();

        if (waehrung == 1) {
            umrechnung = betrag * 1.129;
            System.out.println(betrag + " Euro sind " + umrechnung + " US-Dollar");
        }
        else if (waehrung == 2) {
            umrechnung = betrag * 0.852;
            System.out.println(betrag + " Euro sind " + umrechnung + " Britische Pfund");
        }
        else if (waehrung == 3) {
            umrechnung = betrag * 1.584;
            System.out.println(betrag + " Euro sind " + umrechnung + " Australischer Dollar");
        }
        else if (waehrung == 4) {
            umrechnung = betrag * 128165;
            System.out.println(betrag + " Euro sind " + umrechnung + " Japanischer Jen");
        }
        else {
            System.out.println("Dies ist keine Währung.");
        }
    }
}
