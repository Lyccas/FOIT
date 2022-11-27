package b_12FOIT.ii.figur;

public class MainFigur {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck("Rechteck", 5, 8);
        System.out.println(rechteck.toString());

        System.out.println("*".repeat(30));

        Kreis kreis = new Kreis("Kreis", 4);
        System.out.println(kreis.toString());

        System.out.println("*".repeat(30));

        Dreieck dreieck = new Dreieck("Dreieck", 3, 5);
        System.out.println(dreieck.toString());
    }
}
