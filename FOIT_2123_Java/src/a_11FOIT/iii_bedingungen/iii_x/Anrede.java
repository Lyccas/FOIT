package a_11FOIT.iii_bedingungen.iii_x;

import java.util.Scanner;

public class Anrede {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int anrede;

        System.out.println("Bitte geben Sie ihren Namen an: ");
        name = input.next();
        System.out.println("Bitte wählen Sie ihre Anrede: \n" +
                "1. Herr \n" +
                "2. Frau \n" +
                "3. Andere");
        anrede = input.nextInt();

        if (anrede == 1) {
            System.out.println("Hallo Herr " + name);
        }
        else if (anrede == 2) {
            System.out.println("Hallo Frau " + name);
        }
        else if (anrede == 3) {
            System.out.println("Hallo " + name);
        }
        else {
            System.out.println("Bitte geben Sie eine richtige Anrede an.");
        }
    }
}
