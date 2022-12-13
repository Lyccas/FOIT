package a_11FOIT.x_klassenarbeit;

import java.util.Scanner;

public class Weihnachtskugel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double durchmesser;
        double radius;
        int kugeln;
        double füllmenge;
        double füllmenge_gesamt;
        double stoff;
        double stoff_gesamt;

        System.out.println("Welchen Durchmesser -in cm- sollen deine Kugeln haben?");
        durchmesser = input.nextDouble();
        radius = durchmesser / 2;
        System.out.println("Wie viele Kugeln möchtest du basteln?");
        kugeln = input.nextInt();

        füllmenge = 4 / 3.0 * Math.PI * Math.pow( radius , 3.0);
        füllmenge_gesamt = füllmenge * kugeln;
        stoff = 4 * Math.PI * Math.pow( radius , 2.0);
        stoff_gesamt = stoff * kugeln;

        System.out.println();
        System.out.println("Benötigte Materialien:");
        System.out.println("----------------------");
        System.out.println("Füllwatte pro Kugel:\t\t " + füllmenge + "cm³");
        System.out.println("Füllwatte gesamt:\t\t\t " + füllmenge_gesamt + "cm³");
        System.out.println("Stoff pro Kugel:\t\t\t " + stoff + "cm³");
        System.out.println("Stoff gesamt:\t\t\t\t " + stoff_gesamt + "cm³");
        //gerundete Werte
        System.out.println();
        System.out.println("Füllwatte pro Kugel:\t\t " + Math.round(füllmenge * 100.0) / 100.0 + "cm³");
        System.out.println("Füllwatte gesamt:\t\t\t " + Math.round(füllmenge_gesamt * 100.0) / 100.0 + "cm³");
        System.out.println("Stoff pro Kugel:\t\t\t " + Math.round(stoff * 100.0) / 100.0 + "cm²");
        System.out.println("Stoff gesamt:\t\t\t\t " + Math.round(stoff_gesamt * 100.0) / 100.0 + "cm²");
    }
}
