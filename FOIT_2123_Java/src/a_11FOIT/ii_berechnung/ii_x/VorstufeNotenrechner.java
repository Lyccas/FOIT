package a_11FOIT.ii_berechnung.ii_x;

import java.util.Scanner;

public class VorstufeNotenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Erreichte Punktzahl
        double erreichte_punktzahl;
        System.out.println("Bitte gib die erreichte Punktzahl ein: ");
        erreichte_punktzahl = input.nextDouble();

        //Zuerreichende Punktzahl
        double zuerreichende_punktzahl;
        System.out.println("Bitte gib die zu erreichende Punktzahl ein: ");
        zuerreichende_punktzahl = input.nextDouble();

        //Prozent
        double prozent;
        prozent = erreichte_punktzahl / zuerreichende_punktzahl;

        //OUTPUT
        System.out.println("Es waren " + zuerreichende_punktzahl + " Punkte möglich zu erreichen.");
        System.out.println("Du hast davon " + erreichte_punktzahl + " Punkte erreicht");
        System.out.println("Du hast " + prozent + "% erreicht");
    }
}
