package a_11FOIT.iii_bedingungen.iii_xx;

import java.util.Scanner;

public class Schueler {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        boolean schueler;

        System.out.println("Sind Sie ein Schüler? ");
        schueler = input.nextBoolean();

        if (schueler) {
            System.out.println("Du erhältst eine vergünstigte Fahrkarte");
        }
        else {
            System.out.println("Leider musst du den vollen Preis bezahlen");
        }
    }
}
