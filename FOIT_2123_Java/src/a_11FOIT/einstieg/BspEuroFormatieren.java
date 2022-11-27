package a_11FOIT.einstieg;

import java.util.Scanner;
import java.text.NumberFormat;

public class BspEuroFormatieren {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT

        //Taschengeld
        double taschengeld;
        System.out.println("Bitte gebe dein Taschengeld ein: ");
        taschengeld = input.nextDouble();

        //Taschengeld formatiert
        String taschengeld_formatiert;
        taschengeld_formatiert = NumberFormat.getCurrencyInstance().format(taschengeld);

        //OUTPUT

        //Taschengeld
        System.out.println("Toll! Du erhälst " + taschengeld + " Euro Taschengeld!");

        //Taschengeld formatiert
        System.out.println("Toll! Du erhälst " + taschengeld_formatiert + " Taschengeld!");
    }
}
