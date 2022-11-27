package a_11FOIT.i_variablen.i_xxx;

import java.util.Scanner;

public class ArtikelWerteEinlesen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Artikelbezeichnung
        String artikel_bezeichnung;
        System.out.println("Welchen Artikel bieten Sie an?");
        artikel_bezeichnung = input.next();

        //Artikelverfügbarkeit
        boolean artikel_verfuegbarkeit;
        System.out.println("Ist der Artikel noch auf Lager?");
        artikel_verfuegbarkeit = input.nextBoolean();

        //Artikelmenge
        int artikel_menge;
        System.out.println("Wie oft ist der Artikel noch zu haben?");
        artikel_menge = input.nextInt();

        //Artikelpreis
        double artikel_preis;
        System.out.println("Wie teuer ist der Artikel?");
        artikel_preis = input.nextDouble();

        //OUTPUT

        System.out.println("LAGERBESTAND \n\n" +
                "Artikelbezeichnung:\t\t" + artikel_bezeichnung + "\n" +
                "Artikelverfügbarkeit:\t" + artikel_verfuegbarkeit + "\n" +
                "Artikelmenge:\t\t\t" + artikel_menge + "\n" +
                "Artikelpreis:\t\t\t" + artikel_preis);
    }
}
