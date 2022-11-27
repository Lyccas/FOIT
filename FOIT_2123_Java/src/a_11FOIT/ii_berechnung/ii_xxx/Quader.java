package a_11FOIT.ii_berechnung.ii_xxx;

import java.util.Scanner;

public class Quader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double V;
        double Ao;
        double d;

        System.out.println("Bitte geben Sie die Länge der Seite a an: ");
        a = input.nextDouble();

        System.out.println("Bitte geben Sie die Länge der Seite b an: ");
        b = input.nextDouble();

        System.out.println("Bitte geben Sie die Länge der Seite c an: ");
        c = input.nextDouble();

        V = a * b * c;
        Ao = 2 * ( a * b + a * c + b * c );
        d = Math.sqrt( Math.pow( a , 2.0 ) + Math.pow( b , 2.0 ) + Math.pow( c , 2.0 ));

        System.out.println("Das Volumen beträgt: " + Math.round( V * 100.0) / 100.0 + "cm³");
        System.out.println("Der Oberflächeninhalt beträgt: " + Math.round( Ao * 100.0 ) / 100.0 + "cm²");
        System.out.println("Die Länge der Raumgiagonalen beträgt: " + Math.round( d * 100.0 ) / 100.0 + "cm");
    }
}
