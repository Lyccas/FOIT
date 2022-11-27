package a_11FOIT.ii_berechnung.ii_xxx;

import java.util.Scanner;

public class Dose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double u;
        double h;
        double d_boden;
        double f_boden;
        double f_mantel;
        double f_gesamt;
        double v;

        System.out.println("Wie groß ist der Umfang der Dose: ");
        u = input.nextDouble();

        System.out.println("Wie hoch ist die Dose: ");
        h = input.nextDouble();

        d_boden = u / Math.PI;
        f_boden = Math.PI * Math.pow((d_boden / 2),2);
        f_mantel = u * h;
        f_gesamt = 2 * f_boden + f_mantel;
        v = f_boden * h;

        System.out.println("Der Durchmesser des Dosenbodens beträgt: " + Math.round(d_boden * 100.0) / 100.0);
        System.out.println("Die Fläche des Dosenbodens beträgt: " + Math.round(f_boden * 100.0) / 100.0);
        System.out.println("Die Mantelfläche der Dose beträgt: " + Math.round(f_mantel * 100.0) / 100.0);
        System.out.println("Die Gesamtfläche der Dose beträht: " + Math.round(f_gesamt * 100.0) / 100.0);
        System.out.println("Das Volumen der Dose beträgt: " + Math.round(v * 100.0) / 100.0);
    }
}
