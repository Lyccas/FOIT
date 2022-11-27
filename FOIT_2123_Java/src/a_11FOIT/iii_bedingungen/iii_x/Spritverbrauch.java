package a_11FOIT.iii_bedingungen.iii_x;

import java.util.Scanner;

public class Spritverbrauch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double killometer;
        double verbrauch;
        double verbrauch_auf_100km;

        System.out.println("Wie viele Killometer sind Sie gefahren? ");
        killometer = input.nextDouble();
        System.out.println("Wie viele Liter haben Sie verbrauch? ");
        verbrauch = input.nextDouble();

        if (killometer <= 0) {
            System.out.println("Ungültige Strecke angegeben.");
        }
        else {
            verbrauch_auf_100km = verbrauch * 100.0 / killometer;
            System.out.println("Sie haben einen Verbrauch von " + verbrauch_auf_100km + "l/100Km");
        }
    }
}
