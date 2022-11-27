package a_11FOIT.ii_berechnung.ii_xxx;

import java.util.Scanner;

public class Rechteck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double A;
        double u;
        double d;

        System.out.println("Bitte geben Sie die Länge der Seite a an: ");
        a = input.nextDouble();

        System.out.println("Bitte geben Sie die Länge der Seite b an: ");
        b = input.nextDouble();

        A = a * b;
        u = 2 * a + 2 * b;
        d = Math.sqrt( Math.pow( a , 2.0 ) + Math.pow( b , 2.0 ));

        System.out.println("Der Flächeninhalt beträgt: " + Math.round( A * 100.0 ) / 100.0 + "cm²");
        System.out.println("Der Umfang beträgt: " + Math.round( u * 100.0 ) / 100.0 + "cm");
        System.out.println("Die Diagonalelänge beträgt: " + Math.round( d * 100.0 ) / 100.0 + "cm");
    }
}
