package a_11FOIT.x_klassenarbeit;

import java.util.Random;

public class Eurojackpot {
    public static void main(String[] args) {
        int zufallszahl;
        Random ra = new Random();
        zufallszahl = ra.nextInt(45)+5;
        int eurojackpot [] = new int[5];

        for (int i = 0; i < 5; i++) {
            eurojackpot[i] = zufallszahl;
            for (int u = 0; u < 5; u++) {
                if (zufallszahl == eurojackpot[u]) {
                    zufallszahl = ra.nextInt(45)+5;
                    eurojackpot[u] = zufallszahl;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(eurojackpot[i]);
        }
    }
}
