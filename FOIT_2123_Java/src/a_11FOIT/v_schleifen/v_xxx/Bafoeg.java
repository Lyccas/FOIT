package a_11FOIT.v_schleifen.v_xxx;

import java.util.Scanner;

public class Bafoeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean schueler;
        int monat = 1;
        int bafoeg = 100;
        int bafoeg_gesamt = 0;

        System.out.println("Monat " + monat + ": \nBist du Schüler? ");
        schueler = input.nextBoolean();

        while (schueler) {
            monat++;
            bafoeg_gesamt = bafoeg_gesamt + bafoeg;
            System.out.println("Monat " + monat + ": \nBist du Schüler? ");
            schueler = input.nextBoolean();
        }

        System.out.println("Du hast einen gesamt Bafög von: " + bafoeg_gesamt + "€");
    }
}
