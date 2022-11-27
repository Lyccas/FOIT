package a_11FOIT.iii_bedingungen.iii_x;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bafoeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bafoeg;
        int fehltage;
        double bonus = 1.15;
        double bafoeg_betrag;
        String bafoeg_betrag_formatiert;

        System.out.println("Bitte geben Sie den Bafög an: ");
        bafoeg = input.nextDouble();

        System.out.println("Bitte geben Sie ihre Fehltage an: ");
        fehltage = input.nextInt();

        if (fehltage < 5) {
            bafoeg_betrag = bafoeg * bonus;
        }
        else {
            bafoeg_betrag = bafoeg;
        }

        bafoeg_betrag_formatiert = NumberFormat.getCurrencyInstance().format(bafoeg_betrag);

        System.out.println("Der Bafög-Betrag beträgt " + bafoeg_betrag_formatiert);
    }
}
