package b_12FOIT.x_klassenarbeit.landKontinent;

public class Main {
    public static void main(String[] args) {
        Kontinent asien = new Kontinent("Asien", 44400000);
        Kontinent europa = new Kontinent("Europa", 10500000);

        Land deutschland = new Land("Deutschland", 357588, 83190556, europa);
        Land ukraine = new Land("Ukraine", 603629, 41262393, europa);
        Land china = new Land("Volksrepublic China", 9596961, 1442965000, asien);

        System.out.println(deutschland);
        System.out.println(deutschland.zeigeEinwohnerProQuadratkilometer());
        System.out.println(deutschland.zeigeFlaechenanteil());

        System.out.println("*".repeat(100));

        System.out.println(ukraine);
        System.out.println(ukraine.zeigeEinwohnerProQuadratkilometer());
        System.out.println(ukraine.zeigeFlaechenanteil());

        System.out.println("*".repeat(100));

        System.out.println(china);
        System.out.println(china.zeigeEinwohnerProQuadratkilometer());
        System.out.println(china.zeigeFlaechenanteil());
    }
}
