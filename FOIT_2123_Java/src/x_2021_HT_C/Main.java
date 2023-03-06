package x_2021_HT_C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tierart loewe = new Tierart("Löwe", 3, 3);
        Tierart jaguar = new Tierart("Jaguar", 1.4, 4);
        Tierart tiger = new Tierart("Tiger", 1, 7);

        Tier luner = new Tier("Luner", 4, loewe);
        Tier cathy = new Tier("Cathy", 3, loewe);
        Tier bibus = new Tier("Bibus", 7, jaguar);
        Tier clera = new Tier("Clera", 2, tiger);
        Tier traudi = new Tier("Traudi", 3, tiger);

        System.out.print("Bitte geben Sie ein, für welche Tierart Sie die wöchentliche Futtermenge pro Tier ermitteln möchten: ");
        switch (input.next()) {
            case "Löwe":
                System.out.println(loewe.futtermengeProWoche("Löwe"));
                break;
            case "Jaguar":
                System.out.println(loewe.futtermengeProWoche("Jaguar"));
                break;
            case "Tiger":
                System.out.println(loewe.futtermengeProWoche("Tiger"));
                break;
            default:
                break;
        }
    }
}
