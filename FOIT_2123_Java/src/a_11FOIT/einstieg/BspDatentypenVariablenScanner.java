package a_11FOIT.einstieg;

//Erledigt

import java.util.Scanner;

public class BspDatentypenVariablenScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anzahl_kiste1;
        int anzahl_kiste2;
        int summe;

        System.out.println("Bitte geben Sie die Anzahl der ersten Kiste ein: ");
        anzahl_kiste1 = input.nextInt();
        System.out.println("Anzahl Kiste 2 eingeben: ");
        anzahl_kiste2 = input.nextInt();

        summe = anzahl_kiste1 + anzahl_kiste2;

        System.out.println("Die Summe beträgt: "+summe);
    }
}
