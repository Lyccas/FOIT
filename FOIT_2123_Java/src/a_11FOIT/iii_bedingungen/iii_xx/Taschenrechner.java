package a_11FOIT.iii_bedingungen.iii_xx;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double zahl1;
        double zahl2;
        double ergebnis;
        String rechenzeichen;

        System.out.println("Bitte geben Sie die erste Zahl an: ");
        zahl1 = input.nextDouble();
        System.out.println("Bitte geben Sie die Zweite Zahl an: ");
        zahl2 = input.nextDouble();
        System.out.println("Bitte geben Sie das Rechenzeichen an: ");
        rechenzeichen = input.next();

        if (rechenzeichen.equals("+")) {
            ergebnis = zahl1 + zahl2;
            System.out.println("Ihr Erbegnis von der Rechnung " + zahl1 + " " + rechenzeichen + " " + zahl2 + " ergibt " + ergebnis + ".");
        }
        else if (rechenzeichen.equals("-")) {
            ergebnis = zahl1 - zahl2;
            System.out.println("Ihr Erbegnis von der Rechnung " + zahl1 + " " + rechenzeichen + " " + zahl2 + " ergibt " + ergebnis + ".");
        }
        else if (rechenzeichen.equals("*")) {
            ergebnis = zahl1 * zahl2;
            System.out.println("Ihr Erbegnis von der Rechnung " + zahl1 + " " + rechenzeichen + " " + zahl2 + " ergibt " + ergebnis + ".");
        }
        else if (rechenzeichen.equals("/")) {
            if (zahl2 == 0) {
                System.out.println("Durch Null darf nicht geteilt werden");
            }
            else {
                ergebnis = zahl1 / zahl2;
                System.out.println("Ihr Erbegnis von der Rechnung " + zahl1 + " " + rechenzeichen + " " + zahl2 + " ergibt " + ergebnis + ".");
            }
        }
        else {
            System.out.println("Bitte überprüfen Sie ihre Angaben.");
        }
    }
}
