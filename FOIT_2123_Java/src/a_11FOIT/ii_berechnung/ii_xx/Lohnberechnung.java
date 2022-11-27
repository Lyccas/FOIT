package a_11FOIT.ii_berechnung.ii_xx;

import java.util.Scanner;
import java.text.NumberFormat;

public class Lohnberechnung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Stundenlohn
        double stundenlohn;
        System.out.println("Bitte geben Sie ihren Stundenlohn an: ");
        stundenlohn = input.nextDouble();

        //Stunden
        double stunden;
        System.out.println("Bitte geben Sie ihre monatlichen Arbeitsstunden an: ");
        stunden = input.nextDouble();

        //Gehalt
        double gehalt;
        gehalt = stundenlohn * stunden;

        //Gehalt formatiert
        String gehalt_formatiert;
        gehalt_formatiert = NumberFormat.getNumberInstance().format(gehalt);

        //OUTPUT

        //Gehalt
        System.out.println("Ihr Monatslohn beträgt " + gehalt_formatiert);
    }
}
