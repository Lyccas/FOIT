package a_11FOIT.iii_bedingungen.iii_xxx;

import java.util.Scanner;
import java.text.NumberFormat;

public class Porto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bestellwert;
        double versandkosten;
        double gesamtkosten;
        String gesamtkosten_formatiert;

        System.out.println("Bitte geben Sie ihren Bestellwert an: ");
        bestellwert = input.nextDouble();

        if (bestellwert >= 200) {
            versandkosten = 0;
        }
        else if (bestellwert >= 100) {
            versandkosten = 3;
        }
        else {
            versandkosten = 5.5;
        }

        gesamtkosten_formatiert = NumberFormat.getCurrencyInstance().format(gesamtkosten = bestellwert + versandkosten);
        System.out.println("Ihr Rechnungsbetrag beträgt " + gesamtkosten_formatiert + ".");
    }
}
