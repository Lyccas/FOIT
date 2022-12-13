package a_11FOIT.x_klassenarbeit;

import java.util.Scanner;
import java.text.NumberFormat;

public class Plaetzchen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double preis;
        int bestellmenge;
        double gesamtpreis;
        String preis_formatiert;
        String gesamtpreis_formatiert;

        System.out.print("Bitte geben den Plätzchennamen ein: ");
        name = input.next();
        System.out.print("Bitte geben den Preis in Euro ein: ");
        preis = input.nextDouble();
        System.out.print("Bitte geben die Bestellmenge ein: ");
        bestellmenge = input.nextInt();

        gesamtpreis = preis * bestellmenge;

        preis_formatiert = NumberFormat.getCurrencyInstance().format(preis);
        gesamtpreis_formatiert = NumberFormat.getCurrencyInstance().format(gesamtpreis);

        System.out.println();
        System.out.println("Für " + bestellmenge + " " + name + "(e) zum Preis von " + preis_formatiert + " musst du");
        System.out.println("einen Gesamtpreis von " + gesamtpreis_formatiert + " bezahlen.");
    }
}
