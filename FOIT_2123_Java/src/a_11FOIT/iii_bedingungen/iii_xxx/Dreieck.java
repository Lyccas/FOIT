package a_11FOIT.iii_bedingungen.iii_xxx;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Bitte geben Sie die Länge der Seite a an: ");
        a = input.nextDouble();
        System.out.println("Bitte geben Sie die Länge der Seite b an: ");
        b = input.nextDouble();
        System.out.println("Bitte geben Sie die Länge der Seite c an: ");
        c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Das Dreieck ist konstruierbar.");
        }
        else {
            System.out.println("Das Dreieck ist nicht konstruierbar");
        }
    }
}
