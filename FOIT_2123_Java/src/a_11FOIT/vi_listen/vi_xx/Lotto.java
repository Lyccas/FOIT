package a_11FOIT.vi_listen.vi_xx;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        var lotto = new int [6];

        for(int i = 0; i < lotto.length; i++) {
            int zahl = new Random().nextInt(49)+1;
            for(int u = 0; u < lotto.length; u++) {
                if(lotto[u] == zahl) {
                    zahl = new Random().nextInt(49)+1;
                    u = -1;
                }
            }
            lotto[i] = zahl;
        }

        System.out.println("Lottozahlen");
        for(int z = 0; z < lotto.length; z++) {
            System.out.println(lotto[z]);
        }
    }
}
