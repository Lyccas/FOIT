package b_12FOIT.iv.einkaufsverwaltung;

import java.util.ArrayList;

public class Einkauf {
    private String datum;

    private ArrayList<Produkt> produktliste = new ArrayList<Produkt>();

    public Einkauf() {

    }

    public Einkauf(String datum) {
        this.datum = datum;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void addProdukt(Produkt produkt) {
        produktliste.add(produkt);
    }

    public Produkt getProdukt(int index) {
        return produktliste.get(index);
    }

    public int getAnzahlProdukte() {
        return produktliste.size();
    }

    public ArrayList<Produkt> getProduktliste() {
        return produktliste;
    }

    public double getGesamtpreis() {
        double gesamtPreis = 0;
        for (Produkt produkt : produktliste) {
            gesamtPreis += produkt.getPreis();
        }

        return gesamtPreis;
    }

    public Produkt getProdukt(String bezeichnung) {
        Produkt suche = null;
        for (Produkt produkt : produktliste) {
            if (produkt.getBezeichnung().equals(bezeichnung)) {
                suche = produkt;
            }
        }

        return suche;
    }

    public double getDurchschnittlichenPreis() {
        return getGesamtpreis() / produktliste.size();
    }

    public Produkt getHoechstenPreis() {
        Produkt produkt = produktliste.get(0);
        for (Produkt p : produktliste) {
            if (produkt.getPreis() < p.getPreis()) {
                produkt = p;
            }
        }

        return produkt;
    }

    public Produkt getNiedrigstenPreis() {
        Produkt produkt = produktliste.get(0);
        for (Produkt p : produktliste) {
            if (produkt.getPreis() > p.getPreis()) {
                produkt = p;
            }
        }

        return produkt;
    }

    public ArrayList<Produkt> gebeAlleProdukteWiederDieWenigerAlsEinEuroKosten() {
        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        for (Produkt produkt : produktliste) {
            if (produkt.getPreis() < 1) {
                produkte.add(produkt);
            }
        }

        return produkte;
    }

    public ArrayList<Produkt> suchePreis(double preis) {
        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        for (Produkt produkt : produktliste) {
            if (produkt.getPreis() == preis) {
                produkte.add(produkt);
            }
        }

        return produkte;
    }
}
