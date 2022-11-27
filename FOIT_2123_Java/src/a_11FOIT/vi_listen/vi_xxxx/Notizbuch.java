package a_11FOIT.vi_listen.vi_xxxx;

import java.util.ArrayList;
import java.util.Scanner;

public class Notizbuch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> liste_woerter = new ArrayList<String>();

        int menue;

        System.out.println("Willkommen bei ihrem Notizbuch");
        System.out.println("1: Wort hinzufügen");
        System.out.println("2: Wort löschen");
        System.out.println("3: Hier alle Wörter des Notizbuches im Überblick");
        System.out.println("4: Menü beenden");
        menue = input.nextInt();

        while (menue != 4) {
            if (menue == 1) {
                System.out.println("Bitte geben Sie das Wort ein:");
                liste_woerter.add(input.next());
            } else if (menue == 2) {
                System.out.println("Bitte geben Sie das Wort ein:");
                liste_woerter.remove(input.next());
            } else if (menue == 3) {
                if (liste_woerter.isEmpty()) {
                    System.out.println("Es befindet sich kein Wort in ihrem Notizbuch");
                } else {
                    for (int i = 0; i != liste_woerter.size(); i++) {
                        System.out.println(liste_woerter.get(i));
                    }
                }
            }
            System.out.println("1: Wort hinzufügen");
            System.out.println("2: Wort löschen");
            System.out.println("3: Hier alle Wörter des Notizbuches im Überblick");
            System.out.println("4: Menü beenden");
            menue = input.nextInt();
        }
    }
}