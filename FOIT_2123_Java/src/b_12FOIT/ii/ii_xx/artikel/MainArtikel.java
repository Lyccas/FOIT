package b_12FOIT.ii.ii_xx.artikel;

public class MainArtikel {
    public static void main(String[] args) {
        Artikel apfel = new Artikel();
        apfel.setBezeichnung("Apfel");
        apfel.setNettopreis(0.59);
        apfel.setLagermenge(100);

        System.out.println("Artikel-Name: " + apfel.getBezeichnung());
        System.out.println("Preis: " + apfel.getNettopreis() + "€");
        System.out.println("Lagermenge: " + apfel.getLagermenge());
        System.out.println("Lagerwert (Netto): " + apfel.getLagerwertNettoFormatiert());
        System.out.println("Lagerwert (Brutto): " + apfel.getLagerwertBruttoFormatiert());

        Artikel tomate = new Artikel("Tomate", 0.49);
        System.out.println("--------------------------------------");
        System.out.println("Artikel-Name: " + tomate.getBezeichnung());
        System.out.println("Preis: " + tomate.getNettopreis() + "€");
        System.out.println("Lagermenge: " + tomate.getLagermenge());
        System.out.println("Lagerwert (Netto): " + tomate.getLagerwertNettoFormatiert());
        System.out.println("Lagerwert (Brutto): " + tomate.getLagerwertBruttoFormatiert());

        Artikel gummibaerchen = new Artikel("Gummibärchen");
        System.out.println("--------------------------------------");
        System.out.println("Artikel-Name: " + gummibaerchen.getBezeichnung());
        System.out.println("Preis: " + gummibaerchen.getNettopreis() + "€");
        System.out.println("Lagermenge: " + gummibaerchen.getLagermenge());
        System.out.println("Lagerwert (Netto): " + gummibaerchen.getLagerwertNettoFormatiert());
        System.out.println("Lagerwert (Brutto): " + gummibaerchen.getLagerwertBruttoFormatiert());
    }
}
