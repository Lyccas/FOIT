package a_11FOIT.ii_berechnung.ii_x;

import java.util.Scanner;

public class AdditonGanzzahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int summe;
        int summand1;
        int summand2;

        System.out.println("Sie werden gleich nach 2 Zahlen gefragt, welche addiert werden.");
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        summand1 = input.nextInt();
        System.out.println("Bitte geben Sie eine zweite Zahl ein: ");
        summand2 = input.nextInt();

        summe = summand1 + summand2;

        System.out.println("Summand 1: " + summand1 + "\n" +
                "Summand 2: " + summand2 + "\n" +
                "Summe: " + summand1 + " + " + summand2 + " = " + summe);
    }
}
