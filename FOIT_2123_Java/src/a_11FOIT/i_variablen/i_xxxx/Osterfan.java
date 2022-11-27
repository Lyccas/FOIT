package a_11FOIT.i_variablen.i_xxxx;

import java.util.Scanner;

public class Osterfan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Name
        String name;
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        name = input.next();

        //Grundlohn
        double grundlohn;
        System.out.print("Bitte geben Sie Ihren Grundlohn ein (€): ");
        grundlohn = input.nextDouble();

        //Osterfan
        boolean osterfan;
        System.out.print("Sind Sie Osterfan? ");
        osterfan = input.nextBoolean();

        //Gefärbete Eier
        int gefaerbte_eier;
        System.out.print("Wie viele Eier haben Sie gefärbt?");
        gefaerbte_eier = input.nextInt();

        //OUTPUT

        System.out.println("Hallo " + name + "! Hier ein Überblick über deine Daten:\n" +
                "-------------------------------------------------\n" +
                "Grundlohn:\t\t\t\t\t" + grundlohn + " EUR\n" +
                "Du bist ein Osterfan:\t\t" + osterfan + "\n" +
                "Anzahl der gefärbten Eier:\t" + gefaerbte_eier + " Stück");
    }
}
