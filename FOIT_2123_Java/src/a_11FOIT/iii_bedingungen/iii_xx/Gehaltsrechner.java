package a_11FOIT.iii_bedingungen.iii_xx;

import java.util.Scanner;
import java.text.NumberFormat;

public class Gehaltsrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double gehalt;
        int kinderanzahl;
        boolean verheiratet;
        boolean haustiere;
        double zuschlag_verheiratet;
        double zuschlag_haustier;
        double zuschlag_kinder;
        double end_gehalt;
        String end_gehalt_formatiert;

        System.out.println("Bitte geben Sie ihren Namen an: ");
        name = input.next();
        System.out.println("Bitte geben Sie ihren Grundgehalt an: ");
        gehalt = input.nextDouble();
        System.out.println("Wie viele Kinder haben Sie? ");
        kinderanzahl = input.nextInt();
        System.out.println("Sind Sie verheiratet? ");
        verheiratet = input.nextBoolean();
        System.out.println("Haben Sie Haustiere? ");
        haustiere = input.nextBoolean();

        if (verheiratet) {
            zuschlag_verheiratet = gehalt * 0.01;
        }
        else {
            zuschlag_verheiratet = 0;
        }

        if (haustiere) {
            zuschlag_haustier = gehalt * 0.005;
        }
        else {
            zuschlag_haustier = 0;
        }

        if (kinderanzahl >= 3) {
            zuschlag_kinder = gehalt * 0.05;
        }
        else if (kinderanzahl == 2) {
            zuschlag_kinder = gehalt * 0.02;
        }
        else if (kinderanzahl == 1) {
            zuschlag_kinder = gehalt * 0.015;
        }
        else {
            zuschlag_kinder = 0;
        }

        end_gehalt_formatiert = NumberFormat.getCurrencyInstance().format(end_gehalt = gehalt + zuschlag_verheiratet + zuschlag_haustier + zuschlag_kinder);
        System.out.println("Hallo " + name + ",");
        System.out.println("Wir haben ihren Nettobetrag berechnet.");
        System.out.println("Sie erhalten ein Endgehalt von " + end_gehalt_formatiert);
    }
}
