package a_11FOIT.i_variablen.i_xxxx;

import java.util.Scanner;

public class VariablenEinlesenAusgeben {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Artikel auf Lager
        int artikel_lager;
        System.out.println("Wie oft ist der Artikel noch im Lager? ");
        artikel_lager = input.nextInt();

        //Name eines Spielers
        String spielername;
        System.out.println("Wie heißt dein Lieblingsspiler? ");
        spielername = input.next();

        //Bevölkerung Deutschland
        String bevoelkerung_deutschland = "83 Millionen";

        //Day Night Check
        String day_night_check;
        System.out.println("Ist es Tag oder Nacht? ");
        day_night_check = input.next();

        //Trefferqoute Stürmer
        String trefferqoute_stuermer;
        System.out.println("Wie hoch ist die Trefferqoute des Stürmers? ");
        trefferqoute_stuermer = input.next();

        //Jahre Schule
        int jahre_schule;
        System.out.println("Wie viele Jahre hast du die Schule besucht? ");
        jahre_schule = input.nextInt();

        //Schüler
        String schueler;
        System.out.println("Wie viele Schüler sind auf der Schule? ");
        schueler = input.next();

        //Preis Artikel
        double preis_artikel;
        System.out.println("Wie teuer ist der Artikel? ");
        preis_artikel = input.nextDouble();

        //Bezeichung Klasse
        String bezeichung_klasse;
        System.out.println("Bezeichung der Klasse HBFI/FOS");
        bezeichung_klasse = input.next();

        //Abschluss
        boolean abschluss;
        System.out.println("Hast du deinen Abschluss? ");
        abschluss = input.nextBoolean();

        //Abschlussnote
        String abschluss_note;
        System.out.println("Abschlussnote der HBFI/FOS");
        abschluss_note = input.next();

        //Anfangsbuchstabe Nachname
        String anfangsbuchstabe_nachname;
        System.out.println("Mit welchem Buchstabe beginnt dein Nachname? ");
        anfangsbuchstabe_nachname = input.next();

        //OUTPUT

        //Artikel auf Lager
        System.out.println("\n\nEs sind noch " + artikel_lager + " Artikel im Lager.\n");

        //Name eines Spielers
        System.out.println("Dein Lieblingsspieler ist " + spielername + ".\n");

        //Bevölkerung Deutschland
        System.out.println("Es leben " + bevoelkerung_deutschland + " Menschen in Deutschland.\n");

        //Day Night Check
        System.out.println("Es ist " + day_night_check + ".\n");

        //Trefferqoute Stürmer
        System.out.println("Der Stürmer hat eine Trefferqoute von " + trefferqoute_stuermer + "%.\n");

        //Jahre Schule
        System.out.println("Du warst " + jahre_schule + " Jahre in der Schule.\n");

        //Schüler
        System.out.println("Auf deiner Schule sind " +  schueler + " Schüler.\n");

        //Preis Artikel
        System.out.println("Der Artikel kostet " + preis_artikel + "€.\n");

        //Bezeichung Klasse
        System.out.println("Deine Klassenbezeichnung ist " + bezeichung_klasse + ".\n");

        //Abschluss
        if (abschluss == true) {
            System.out.println("Du hast deinen Abschluss.\n");
        }
        else if (abschluss == false) {
            System.out.println("Du hast deinen Abschluss noch nicht.\n");
        }
        else {
            System.out.println("Dies ist keine korrekte Angabe.\n");
        }

        //Abschlussnote
        System.out.println("Deine Abschlussnote ist eine " + abschluss_note + ".\n");

        //Anfangsbuchstabe Nachname
        System.out.println("Dein Nachname beginnt mit einem " + anfangsbuchstabe_nachname + ".\n");
    }
}
