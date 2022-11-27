package a_11FOIT.ii_berechnung.ii_x;

import java.util.Scanner;

public class AdditonKommazahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double summe;
        double summand1;
        double summand2;

        System.out.println("Sie werden gleich nach 2 Zahlen gefragt, welche addiert werden.");
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        summand1 = input.nextDouble();
        System.out.println("Bitte geben Sie eine zweite Zahl ein: ");
        summand2 = input.nextDouble();

        summe = summand1 + summand2;

        System.out.println("Summand 1: " + summand1 + "\n" +
                "Summand 2: " + summand2 + "\n" +
                "Summe: " + summand1 + " + " + summand2 + " = " + summe);
    }
}
