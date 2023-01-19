package b_12FOIT.iv.einkaufsverwaltung;

public class MainEinkauf {
    public static void main(String[] args) {
        Produkt eier = new Produkt("Eier", 1.5);
        Produkt milch = new Produkt("Milch", 8);
        Produkt butter = new Produkt("gesalzene Butter", 6);

        Einkauf einkauf = new Einkauf("19.01.2023");

        einkauf.addProdukt(eier);
        einkauf.addProdukt(milch);
        einkauf.addProdukt(butter);

        System.out.println(einkauf.getAnzahlProdukte());
    }
}
