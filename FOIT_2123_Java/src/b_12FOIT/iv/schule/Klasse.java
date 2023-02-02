package b_12FOIT.iv.schule;

import java.util.ArrayList;

public class Klasse {
    private String bezeichnung;

    private ArrayList<Schueler> schuelerInKlasse = new ArrayList<Schueler>();

    public Klasse(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public ArrayList<Schueler> getSchuelerInKlasse() {
        return schuelerInKlasse;
    }

    public void setSchuelerInKlasse(ArrayList<Schueler> schuelerInKlasse) {
        this.schuelerInKlasse = schuelerInKlasse;
    }

    public void addSchueler(Schueler schueler) {
        schuelerInKlasse.add(schueler);
    }

    public double avgTg() {
        double tg = 0;
        for (Schueler schueler : schuelerInKlasse) {
            tg += schueler.getTaschengeld();
        }

        return tg / schuelerInKlasse.size();
    }

    public double hoechstesTg() {
        double tg = schuelerInKlasse.get(0).getTaschengeld();
        for (Schueler schueler : schuelerInKlasse) {
            if (schueler.getTaschengeld() > tg) {
                tg = schueler.getTaschengeld();
            }
        }

        return tg;
    }

    public Schueler hoechstesTgSchueler() {
        Schueler hoechstesTg = schuelerInKlasse.get(0);
        for (Schueler schueler : schuelerInKlasse) {
            if (schueler.getTaschengeld() > hoechstesTg.getTaschengeld()) {
                hoechstesTg = schueler;
            }
        }

        return hoechstesTg;
    }

    public double niedrigstesTg() {
        double tg = schuelerInKlasse.get(0).getTaschengeld();
        for (Schueler schueler : schuelerInKlasse) {
            if (schueler.getTaschengeld() < tg) {
                tg = schueler.getTaschengeld();
            }
        }

        return tg;
    }

    public Schueler niedrigstesTgSchueler() {
        Schueler hoechstesTg = schuelerInKlasse.get(0);
        for (Schueler schueler : schuelerInKlasse) {
            if (schueler.getTaschengeld() < hoechstesTg.getTaschengeld()) {
                hoechstesTg = schueler;
            }
        }

        return hoechstesTg;
    }

    public ArrayList<Schueler> schuelerMitMehrAls100Tg() {
        ArrayList<Schueler> schueler100 = new ArrayList<Schueler>();
        for (Schueler schueler : schuelerInKlasse) {
            if (schueler.getTaschengeld() < 100) {
                schueler100.add(schueler);
            }
        }

        return schueler100;
    }

    @Override
    public String toString() {
        return "Klassen-Name: " + bezeichnung;
    }
}
