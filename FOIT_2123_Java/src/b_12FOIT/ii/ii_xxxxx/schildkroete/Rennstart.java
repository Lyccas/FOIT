package b_12FOIT.ii.ii_xxxxx.schildkroete;

import java.util.Scanner;

public class Rennstart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Schildkroete schildi1 = new Schildkroete("Peter - Schildi", 45, 2);
        Schildkroete schildi2 = new Schildkroete("Petra - Schildi", 30, 3);
        int streckenlaenge = 20;

        Rennen rennen = new Rennen();

        rennen.addSchildkroete(schildi1);
        rennen.addSchildkroete(schildi2);

        do {
            if (schildi1.isTankLeer(schildi1.getEnergiepunkte(), schildi1.getAlter())) {
                System.out.println(schildi1.getName() + " Ihr Tank ist leer, wollen Sie für 4 oder 9 Energiepunkte tanken?");
                schildi1.tanken(input.nextInt());
            }
            if (schildi2.isTankLeer(schildi2.getEnergiepunkte(), schildi2.getAlter())) {
                System.out.println(schildi2.getName() + " Ihr Tank ist leer, wollen Sie für 4 oder 9 Energiepunkte tanken?");
                schildi2.tanken(input.nextInt());
            }
            schildi1.krieche();
            schildi2.krieche();
            System.out.println(zeigeRennstrecke(streckenlaenge));
            System.out.println("1. " + zeigeStreckeSchildi("-", schildi1.getStrecke()));
            System.out.println("2. " + zeigeStreckeSchildi("-", schildi2.getStrecke()));
        } while (schildi1.getStrecke() < streckenlaenge && schildi2.getStrecke() < streckenlaenge);

        System.out.println("*".repeat(30));

        System.out.println("Gewinner:");
        System.out.println(rennen.ermittleGewinner());
    }

    public static String zeigeRennstrecke(int rennstrecke) {
        return "   " + "=".repeat(rennstrecke);
    }

    public static String zeigeStreckeSchildi(String zeichen, int zuruckgelegteStrecke) {
        return zeichen.repeat(zuruckgelegteStrecke) + "x";
    }
}
