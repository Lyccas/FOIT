package a_11FOIT.x_einstieg;

import java.util.Scanner;
import java.util.ArrayList;

public class StringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> StringCases = new ArrayList<String>();
        int anzahl;
        int auswahl;

        System.out.println("Wie viele Sätze willst du speichern?");
        anzahl = input.nextInt();

        for (int i = 0; i < anzahl; i++) {
            System.out.println("Bitte geben Sie einen Satz ein:");
            StringCases.add(input.next());
        }

        System.out.println("---------------------------------------");
        System.out.println("1: Nur das erste Wort");
        System.out.println("2: Vokale tauschen");
        System.out.println("3: Länge des Satzes");
        System.out.println("4: Alles klein schreiben");
        System.out.println("5: Alles groß schreiben");
        System.out.println("6: split");
        System.out.println("7: indexOf");
        System.out.println("8: lastIndexOf");
        System.out.println("9: equals");
        System.out.println("Bitte geben Sie einen Index ein:");
        auswahl = input.nextInt();

        switch (auswahl) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                for (int i = 0; i < anzahl; i++) {
                    System.out.println(StringCases.get(i).length());
                }
                break;
            case 4:
                for (int i = 0; i < anzahl; i++) {
                    System.out.println(StringCases.get(i).toLowerCase());
                }
                break;
            case 5:
                for (int i = 0; i < anzahl; i++) {
                    System.out.println(StringCases.get(i).toUpperCase());
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                System.out.println("Dies ist kein gültiger Parameter");
        }
    }
}
