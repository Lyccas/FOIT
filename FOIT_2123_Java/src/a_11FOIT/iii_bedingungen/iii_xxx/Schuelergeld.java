package a_11FOIT.iii_bedingungen.iii_xxx;

import java.util.Scanner;
import java.text.NumberFormat;

public class Schuelergeld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double standart = 1;
        int fehltage;
        double fehltage_zusatz;
        double durchschnittsnote;
        double durchschnittsnote_zusatz;
        double taschengeld;
        String taschengeld_formatiert;

        System.out.println("Bitte geben Sie ihre Fehltage an: ");
        fehltage = input.nextInt();
        System.out.println("Bitte geben Sie ihren Notendurchschnitt an: ");
        durchschnittsnote = input.nextDouble();

        if (fehltage <= 2) {
            fehltage_zusatz = 4;
        }
        else if (fehltage <= 8) {
            fehltage_zusatz = 2;
        }
        else {
            fehltage_zusatz = 0;
        }

        if (durchschnittsnote <= 2.2) {
            durchschnittsnote_zusatz = 8;
        }
        else {
            durchschnittsnote_zusatz = 0;
        }

        taschengeld_formatiert = NumberFormat.getCurrencyInstance().format(taschengeld = standart + fehltage_zusatz + durchschnittsnote_zusatz);
        System.out.println("Du bekommst ein Taschengeld von " + taschengeld_formatiert + ".");
    }
}
