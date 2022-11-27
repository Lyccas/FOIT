package b_12FOIT.ii.ii_xxx.arbeitnehmer;

import java.util.Scanner;

public class Startklasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Arbeitnehmer arbeiter = new Arbeitnehmer();

        System.out.print("Bitte geben Sie ihren Namen an: ");
        arbeiter.setName(input.next());

        System.out.print("Bitte geben Sie ihr Grundgehalt an: ");
        arbeiter.setGrundgehalt(input.nextDouble());

        System.out.print("Wie viele Kinder haben Sie? ");
        arbeiter.setKinderanzahl(input.nextInt());

        System.out.print("Sind Sie verheiratet? ");
        arbeiter.setIsVerheiratet(input.nextBoolean());

        System.out.print("Haben Sie Haustiere? ");
        arbeiter.setHaustier(input.nextBoolean());

        System.out.println(arbeiter.zeigeGesamtueberblick());
    }
}
