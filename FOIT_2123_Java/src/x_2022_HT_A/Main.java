package x_2022_HT_A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pflegeheim pflegeheim = new Pflegeheim(13000);

        Pflegegrad grad1 = new Pflegegrad(1, 520);
        Pflegegrad grad2 = new Pflegegrad(2, 770);
        Pflegegrad grad3 = new Pflegegrad(3, 1262);
        Pflegegrad grad4 = new Pflegegrad(4, 1775);
        Pflegegrad grad5 = new Pflegegrad(5, 2005);

        Bewohner helgaSchneider = new Bewohner("Helga Schneider", grad3);
        Bewohner mariettaWest = new Bewohner("Marietta West", grad2);
        Bewohner karlApril = new Bewohner("Karl April", grad5);
        Bewohner udoStern = new Bewohner("Udo Stern", grad4);
        Bewohner franzAlster = new Bewohner("Franz Alster", grad2);

        pflegeheim.addBewohner(helgaSchneider);
        pflegeheim.addBewohner(mariettaWest);
        pflegeheim.addBewohner(karlApril);
        pflegeheim.addBewohner(udoStern);
        pflegeheim.addBewohner(franzAlster);

        System.out.println(pflegeheim);

        System.out.println("Wie heißt der/die neue Bewohner/in? ");
        Bewohner bewohner = new Bewohner();
        bewohner.setName(input.nextLine());
        System.out.println("Welchen Pflegegrad hat diese/r Bewohner/in? ");
        switch (input.nextInt()) {
            case 1:
                bewohner.setPflegegrad(grad1);
                break;
            case 2:
                bewohner.setPflegegrad(grad2);
                break;
            case 3:
                bewohner.setPflegegrad(grad3);
                break;
            case 4:
                bewohner.setPflegegrad(grad4);
                break;
            case 5:
                bewohner.setPflegegrad(grad5);
                break;
            default:
                break;
        }
        pflegeheim.addBewohner(bewohner);
        System.out.println(pflegeheim);

        System.out.println(pflegeheim.berechneEEETagFormat());

        System.out.println(pflegeheim.anzahlPflegegrad());
        System.out.println(pflegeheim.avgPflegegrad());
    }
}
