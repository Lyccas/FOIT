package a_11FOIT.iii_bedingungen.iii_x;

import java.util.Scanner;

public class Kindergeldsonderszahlung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kinder;

        System.out.println("Bitte geben Sie an wie viele Kinder Sie haben: ");
        kinder = input.nextInt();

        if (kinder >= 3) {
            System.out.println("Sie bekommen 500,00 € Kindergeldsonderzahlung");
        }
        else if (kinder == 2) {
            System.out.println("Sie bekommen 250,00 € Kindergeldsonderzahlung");
        }
        else if (kinder == 1) {
            System.out.println("Sie bekommen 100,00 € Kindergeldsonderzahlung");
        }
        else {
            System.out.println("Sie bekommen keine Kindergeldsonderzahlung");
        }
    }
}
