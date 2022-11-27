package a_11FOIT.v_schleifen.v_xxxx;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int obergrenze;
        int tipp;
        int versuche = 0;

        System.out.println("Bitte geben Sie eine Obergrenze an: ");
        obergrenze = input.nextInt();

        int zahl = random.nextInt(0 + obergrenze);

        do {
            versuche ++;
            System.out.println("Versuch " + versuche + ": Dein Tipp?");
            tipp = input.nextInt();
            if (tipp > zahl) {
                System.out.println("Die Zahl ist kleiner.");
            }
            if (tipp < zahl) {
                System.out.println("Die Zahl ist größer");
            }
        } while (tipp != zahl);
        System.out.println("Du hast die Zahl mit " + versuche + " Versuchen erraten.");
    }
}