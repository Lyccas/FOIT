package a_11FOIT.ii_berechnung.ii_xxxx;

import java.util.Scanner;
import java.text.NumberFormat;

public class Kassenbon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int wurst_anzahl;
        double wurst_preis = 4.20;
        String wurst_preis_formatiert = NumberFormat.getCurrencyInstance().format(wurst_preis);
        double wurst_gesamt;
        String wurst_gesamt_formatiert;
        int kaese_anzahl;
        double kaese_preis = 2.30;
        String kaese_preis_formatiert = NumberFormat.getCurrencyInstance().format(kaese_preis);
        double kaese_gesamt;
        String kaese_gesamt_formatiert;
        int brot_anzahl;
        double brot_preis = 2.10;
        String brot_preis_formatiert = NumberFormat.getCurrencyInstance().format(brot_preis);
        double brot_gesamt;
        String brot_gesamt_formatiert;
        int fleisch_anzahl;
        double fleisch_preis = 12.0;
        String fleisch_preis_formatiert = NumberFormat.getCurrencyInstance().format(fleisch_preis);
        double fleisch_gesamt;
        String fleisch_gesamt_formatiert;
        double gesamt;
        String gesamt_formatiert;
        double gegeben;
        String gegeben_formatiert;
        double zurueck;
        String zurueck_formatiert;

        System.out.println("Wie viel Stücke Wurst haben Sie gekauft: ");
        wurst_anzahl = input.nextInt();
        wurst_gesamt = wurst_anzahl * wurst_preis;
        wurst_gesamt_formatiert = NumberFormat.getCurrencyInstance().format(wurst_gesamt);

        System.out.println("Wie viele Stück Käse haben Sie gekauft: ");
        kaese_anzahl = input.nextInt();
        kaese_gesamt = kaese_anzahl * kaese_preis;
        kaese_gesamt_formatiert = NumberFormat.getCurrencyInstance().format(kaese_gesamt);

        System.out.println("Wie viele Stück Brot haben Sie gekauft: ");
        brot_anzahl = input.nextInt();
        brot_gesamt = brot_anzahl * brot_preis;
        brot_gesamt_formatiert = NumberFormat.getCurrencyInstance().format(brot_gesamt);

        System.out.println("Wie viele Stück Fleisch haben Sie gekauft: ");
        fleisch_anzahl = input.nextInt();
        fleisch_gesamt = fleisch_anzahl * fleisch_preis;
        fleisch_gesamt_formatiert = NumberFormat.getCurrencyInstance().format(fleisch_gesamt);

        System.out.println("Welchen Betrag haben Sie dem Kassierer gegeben: ");
        gegeben = input.nextDouble();
        gegeben_formatiert = NumberFormat.getCurrencyInstance().format(gegeben);

        gesamt = wurst_gesamt + kaese_gesamt + brot_gesamt + fleisch_gesamt;
        gesamt_formatiert = NumberFormat.getCurrencyInstance().format(gesamt);

        zurueck = gegeben - gesamt;
        zurueck_formatiert = NumberFormat.getCurrencyInstance().format(zurueck);

        System.out.println("Wurst\t\t " + wurst_anzahl + " x  " + wurst_preis_formatiert);
        System.out.println("\t\t\t\t\t\t  " + wurst_gesamt_formatiert);
        System.out.println("Käse\t\t " + kaese_anzahl + " x  " + kaese_preis_formatiert);
        System.out.println("\t\t\t\t\t\t  " + kaese_gesamt_formatiert);
        System.out.println("Brot\t\t " + brot_anzahl + " x  " + brot_preis_formatiert);
        System.out.println("\t\t\t\t\t\t  " + brot_gesamt_formatiert);
        System.out.println("Fleisch\t\t " + fleisch_anzahl + " x  " + fleisch_preis_formatiert);
        System.out.println("\t\t\t\t\t\t  " + fleisch_gesamt_formatiert);
        System.out.println("---------------------------------");
        System.out.println("Gesamt\t\t\t\t\t  " + gesamt_formatiert);
        System.out.println("Gegeben\t\t\t\t\t  " + gegeben_formatiert);
        System.out.println("");
        System.out.println("Zurück\t\t\t\t\t  " + zurueck_formatiert);
    }
}
