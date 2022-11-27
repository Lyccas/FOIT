package a_11FOIT.iii_bedingungen.iii_xx;

import java.util.Scanner;

public class MonatszahlAusgeben {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String monat;

        System.out.println("Bitte geben Sie einen Monat an: ");
        monat = input.next();

        if (monat.equals("Januar") || monat.equals("januar")) {
            System.out.println("1");
        }
        else if (monat.equals("Februar") || monat.equals("februar")) {
            System.out.println("2");
        }
        else if (monat.equals("März") || monat.equals("märz")) {
            System.out.println("3");
        }
        else if (monat.equals("April") || monat.equals("april")) {
            System.out.println("4");
        }
        else if (monat.equals("Mai") || monat.equals("mai")) {
            System.out.println("5");
        }
        else if (monat.equals("Juni") || monat.equals("juni")) {
            System.out.println("6");
        }
        else if (monat.equals("Juli") || monat.equals("juli")) {
            System.out.println("7");
        }
        else if (monat.equals("August") || monat.equals("august")) {
            System.out.println("8");
        }
        else if (monat.equals("September") || monat.equals("september")) {
            System.out.println("9");
        }
        else if (monat.equals("Oktober") || monat.equals("oktober")) {
            System.out.println("10");
        }
        else if (monat.equals("November") || monat.equals("november")) {
            System.out.println("11");
        }
        else if (monat.equals("Dezember") || monat.equals("dezember")) {
            System.out.println("12");
        }
        else {
            System.out.println("Ihre Eingabe " + monat + " ist kein Monat im deutschen Kalender");
        }
    }
}
