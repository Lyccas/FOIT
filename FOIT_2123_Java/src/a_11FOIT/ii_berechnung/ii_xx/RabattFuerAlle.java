package a_11FOIT.ii_berechnung.ii_xx;

import java.util.Scanner;
import java.text.NumberFormat;

public class RabattFuerAlle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Game Preis
        double game_preis;
        System.out.println("Wie viel hat das Game gekostet: ");
        game_preis = input.nextDouble();

        //Game Preis formatiert
        String game_preis_formatiert;
        game_preis_formatiert = NumberFormat.getCurrencyInstance().format(game_preis);

        //Rabatt Prozent
        double rabatt_prozent;
        String rabatt_prozent_text;
        rabatt_prozent = 0.15;
        rabatt_prozent_text = "15 %";

        //Rabatt
        double konkurrenz;
        String konkurrenz_formatiert;
        double rabatt;
        String rabatt_formatiert;
        konkurrenz = game_preis * rabatt_prozent;
        konkurrenz_formatiert = NumberFormat.getCurrencyInstance().format(konkurrenz);
        rabatt = game_preis - konkurrenz;
        rabatt_formatiert = NumberFormat.getCurrencyInstance().format(rabatt);

        //Rabatt formatiert

        //OUTPUT

        System.out.println("Rabatt Aktion");
        System.out.println("---------------------------");
        System.out.println("Game Preis:\t\t\t\t" + game_preis_formatiert);
        System.out.println("Rabatt:\t\t\t\t\t" + rabatt_prozent_text);
        System.out.println("Unterschied Konkurrenz:\t" + konkurrenz_formatiert);
        System.out.println("Reduzierter Preis:\t\t" + rabatt_formatiert);
    }
}
