package b_12FOIT.ii.ii_xxx.konto;

import java.util.Scanner;

public class Kontobewegung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int auswahl;

        Konto user1 = new Konto("DE10 1007 2005 2003 1224 34", 150.90, 100);
        Konto user2 = new Konto("DE10 1007 2455 2003 1224 34", 290.40, 50);

        System.out.println("Guten Tag,");
        System.out.println("hier eine Übersicht über ihr Konto");
        System.out.println("");
        System.out.println("IBAN: " + user1.getIban());
        System.out.println("Kontostand: " + user1.getKontostandFormatiert());
        System.out.println("Limit: " + user1.getLimitFormatiert());
        System.out.println("Dispo: " + user1.getDispoFormatiert());
        System.out.println("");
        System.out.println("1: Geld einzahlen");
        System.out.println("2: Geld auszahlen");
        System.out.println("3: Dispo neu setzen");
        System.out.println("4: Schließen");
        auswahl = input.nextInt();

        switch (auswahl) {
            case 1:
                System.out.print("Wie viel Geld wollen Sie einzahlen? ");
                user1.einzahlen(input.nextDouble());

                System.out.println("Dein neuer Kontostand beträgt: " + user1.getKontostandFormatiert());
                break;
            case 2:
                System.out.print("Wie viel Geld wollen Sie auszahlen? ");
                user1.auszahlen(input.nextDouble());

                System.out.println("Dein neuer Kontostand beträgt: " + user1.getKontostandFormatiert());
                break;
            case 3:
                System.out.print("Wie hoch soll Ihr neuer Dispo sein? ");
                user1.setDispo(input.nextDouble());

                System.out.println("Ihr neuer Dispo beträgt: " + user1.getDispoFormatiert());
                break;
            case 4:
                break;
            default:
                System.out.println("Ungültiger Parameter");
        }

        System.out.println("Guten Tag,");
        System.out.println("hier eine Übersicht über ihr Konto");
        System.out.println("");
        System.out.println("IBAN: " + user2.getIban());
        System.out.println("Kontostand: " + user2.getKontostandFormatiert());
        System.out.println("Limit: " + user2.getLimitFormatiert());
        System.out.println("Dispo: " + user2.getDispoFormatiert());
        System.out.println("");
        System.out.println("1: Geld einzahlen");
        System.out.println("2: Geld auszahlen");
        System.out.println("3: Dispo neu setzen");
        System.out.println("4: Schließen");
        auswahl = input.nextInt();

        switch (auswahl) {
            case 1:
                System.out.print("Wie viel Geld wollen Sie einzahlen? ");
                user2.einzahlen(input.nextDouble());

                System.out.println("Dein neuer Kontostand beträgt: " + user2.getKontostandFormatiert());
                break;
            case 2:
                System.out.print("Wie viel Geld wollen Sie auszahlen? ");
                user2.auszahlen(input.nextDouble());

                System.out.println("Dein neuer Kontostand beträgt: " + user2.getKontostandFormatiert());
                break;
            case 3:
                System.out.print("Wie hoch soll Ihr neuer Dispo sein? ");
                user2.setDispo(input.nextDouble());

                System.out.println("Ihr neuer Dispo beträgt: " + user2.getDispoFormatiert());
                break;
            case 4:
                break;
            default:
                System.out.println("Ungültiger Parameter");
        }
    }
}
