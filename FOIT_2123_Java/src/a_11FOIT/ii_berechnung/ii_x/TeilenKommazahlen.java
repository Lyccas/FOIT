package a_11FOIT.ii_berechnung.ii_x;

import java.util.Scanner;

public class TeilenKommazahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quotient;
        double divident1;
        double divident2;

        System.out.println("Sie werden gleich nach 2 Zahlen gefragt, welche dividiert werden.");
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        divident1 = input.nextDouble();
        System.out.println("Bitte geben Sie eine zweite Zahl ein: ");
        divident2 = input.nextDouble();

        quotient = divident1 / divident2;

        System.out.println("Divident 1: " + divident1 + "\n" +
                "Divident 2: " + divident2 + "\n" +
                "Quotient: " + divident1 + " / " + divident2 + " = " + quotient);
    }
}
