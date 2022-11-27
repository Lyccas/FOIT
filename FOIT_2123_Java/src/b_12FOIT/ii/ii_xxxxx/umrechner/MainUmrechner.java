package b_12FOIT.ii.ii_xxxxx.umrechner;

import java.util.Scanner;

public class MainUmrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("POSITIV / NEGATIV: Bitte geben Sie eine gerade Zahl ein: ");
        System.out.println(Umrechner.meldungPoOderNe(input.nextInt()));
        System.out.println();

        System.out.println("MULTIPLIKATION: Bitte geben Sie zwei gerade Zahlen ein: ");
        System.out.println(Umrechner.multiplizieren(input.nextInt(), input.nextInt()));
        System.out.println();

        System.out.println("ADDITION: Bitte geben Sie zwei Zahlen ein: ");
        System.out.println(Umrechner.addieren(input.nextDouble(), input.nextDouble()));
        System.out.println();

        System.out.println("WÄHRUNG: Bitte geben Sie eine Zahl ein: ");
        System.out.println(Umrechner.zahlInEuro(input.nextDouble()));
        System.out.println();

        System.out.println("WURZEL: Bitte geben Sie eine gerade, positive Zahl an: ");
        System.out.println(Umrechner.wurzelZiehen(input.nextInt()));
        System.out.println();

        System.out.println("WURZEL: Bitte geben Sie eine gerade, positive Zahl an und den dazugehörigen Wurzelfaktor: ");
        System.out.println(Umrechner.wurzelZiehen(input.nextInt(), input.nextInt()));
        System.out.println();

        System.out.println("POTENZ: Bitte geben Sie eine gerade Zahl und den dazugehörigen geraden Exponenten an: ");
        System.out.println(Umrechner.potenzieren(input.nextInt(), input.nextInt()));
        System.out.println();

        System.out.println("TEILERMENGE: Bitte geben Sie eine gerade Zahl an: ");
        System.out.println("Teiler: " + Umrechner.teilermengeAusgaben(input.nextInt()));
        System.out.println();

        System.out.println("BINÄR: Bitte geben Sie eine gerade Zahl an: ");
        System.out.println(Umrechner.dezimalNachBinaer(input.nextInt()));
    }
}
