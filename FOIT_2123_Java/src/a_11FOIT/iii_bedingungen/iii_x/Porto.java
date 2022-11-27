package a_11FOIT.iii_bedingungen.iii_x;

import java.util.Scanner;
import java.text.NumberFormat;

public class Porto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bestellwert;
        double versandpauschale = 5.50;
        double rechnungsbetrag;
        String rechnungsbetrag_formatiert;

        System.out.println("Bestellwert: ");
        bestellwert = input.nextDouble();

        if (bestellwert <= 200) {
            rechnungsbetrag = bestellwert + versandpauschale;
        }
        else {
            rechnungsbetrag = bestellwert;
        }

        rechnungsbetrag_formatiert = NumberFormat.getCurrencyInstance().format(rechnungsbetrag);

        System.out.println("Der Rechnungsbetrag beträgt: " + rechnungsbetrag_formatiert);
    }
}
