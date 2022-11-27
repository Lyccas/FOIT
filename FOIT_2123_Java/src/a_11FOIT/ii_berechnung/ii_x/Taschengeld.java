package a_11FOIT.ii_berechnung.ii_x;

import java.util.Scanner;
import java.text.NumberFormat;

public class Taschengeld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Taschengeld Mama
        double taschengeld_mama;
        System.out.println("Bitte gib dein Taschengeld von deiner Mama ein: ");
        taschengeld_mama = input.nextDouble();

        //Taschengeld Oma
        double taschengeld_oma;
        System.out.println("Bitte gib dein Taschengeld von deiner Oma ein: ");
        taschengeld_oma = input.nextDouble();

        //Taschengeld Opa
        double taschengeld_opa;
        System.out.println("Bitte gib dein Taschengeld von deinem Opa ein: ");
        taschengeld_opa = input.nextDouble();

        //Taschengeld zusammen
        double taschengeld_zusammen;
        taschengeld_zusammen = taschengeld_mama + taschengeld_oma + taschengeld_opa;

        //Taschengeld formatiert
        String taschengeld_formatiert;
        taschengeld_formatiert = NumberFormat.getCurrencyInstance().format(taschengeld_zusammen);

        //OUTPUT

        //Taschengeld
        System.out.println("Du hast zusammengerechnet " + taschengeld_formatiert + " Taschengeld.");
    }
}
