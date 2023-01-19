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
        return Produkt.getAnzahlProdukte();
    }

    public ArrayList<Produkt> getProduktliste() {
        return produktliste;
    }

    public double getGesamtpreis() {
        double gesamtPreis = 0;
        for (Produkt produkt : produktliste) {
            gesamtPreis = gesamtPreis + produkt.getPreis();
        }

        return gesamtPreis;
    }

    public Produkt getProdukt(String bezeichnung) {
        for (Produkt produkt : produktliste) {
            if (produkt.getBezeichnung() == bezeichnung) {
                return produkt;
            }
        }

        return null;
    }

    public double getDurchschnittlichenPreis() {
        return getGesamtpreis() / produktliste.size();
    }

    public Produkt getHoechstenPreis() {
        double preis = produktliste.get(0).getPreis();
        for (Produkt produkt : produktliste) {
            if(preis < produkt.getPreis()) {
                preis += produkt.getPreis();
                return produkt;
            }
        }

        return null;
    }

    public Produkt getNiedrigstenPreis() {
        double preis = produktliste.get(0).getPreis();
        for (Produkt produkt : produktliste) {
            if(preis > produkt.getPreis()) {
                preis -= produkt.getPreis();
                return produkt;
            }
        }

        return null;
    }

    public ArrayList<Produkt> gebeAlleProdukteWiederDieWenigerAlsEinEuroKosten() {
        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        for(Produkt produkt : produktliste) {
            if(produkt.getPreis() < 1) {
                produkte.add(produkt);
            }
        }

        return produkte;
    }

    public ArrayList<Produkt> suchePreis(double preis) {
        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        for(Produkt produkt : produktliste) {
            if(produkt.getPreis() == preis) {
                produkte.add(produkt);
            }
        }

        return produkte;
    }
}
