package a_11FOIT.v_schleifen.v_xxx;

import java.util.Random;
import java.util.Scanner;

public class GeradeUngerade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random zufall = new Random();

        int durchlaeufe;
        int i = 0;
        String player1;
        int points1 = 0;
        String player2;
        int points2 = 0;
        String gewinner;

        System.out.println("Wie viele Durchläufe wollt ihr spielen ?");
        durchlaeufe = input.nextInt();

        while (i < durchlaeufe) {
            i++;
            int zahl = zufall.nextInt();
            System.out.println();
            System.out.println("Durchlauf " + i);
            System.out.println("Spieler 1:");
            System.out.println("Ist die Zahl GERADE oder UNGERADE ?");
            player1 = input.next();
            System.out.println("Spieler 2:");
            System.out.println("Ist die Zahl GERADE oder UNGERADE ?");
            player2 = input.next();
            if (zahl % 2 == 0) {
                System.out.println();
                System.out.println("Die Zahl war Gerade.");
                if (player1.equals("Gerade")) {
                    points1 = points1 + 1;
                }
                if (player2.equals("Gerade")) {
                    points2 = points2 + 1;
                }
            }
            else {
                System.out.println();
                System.out.println("Die Zahl war Ungerade.");
                if (player1.equals("Ungerade")) {
                    points1 = points1 + 1;
                }
                if (player2.equals("Ungerade")) {
                    points2 = points2 + 1;
                }
            }
        }
        if (points1 > points2) {
            System.out.println();
            System.out.println("Der Gewinner ist Spieler 1");
        }
        else if(points2 > points1) {
            System.out.println();
            System.out.println("Der Gewinner ist Spieler 2");
        }
        else {
            System.out.println();
            System.out.println("Unentschieden");
        }
    }
}