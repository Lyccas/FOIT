package b_12FOIT.iv.schule;

import java.util.ArrayList;

public class Schule {
    private String bezeichnung;

    private ArrayList<Klasse> klassenInSchule = new ArrayList<Klasse>();

    public Schule(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public ArrayList<Klasse> getKlassenInSchule() {
        return klassenInSchule;
    }

    public void setKlassenInSchule(ArrayList<Klasse> klassenInSchule) {
        this.klassenInSchule = klassenInSchule;
    }

    public void addKlasse(Klasse klasse) {
        klassenInSchule.add(klasse);
    }

    public double niedrigstesTg() {
        double tg = klassenInSchule.get(0).niedrigstesTg();
        for (Klasse klasse : klassenInSchule) {
            if (klasse.niedrigstesTg() < tg) {
                tg = klasse.niedrigstesTg();
            }
        }

        return tg;
    }

    public double avgTg(String name) {
        double tg = 0;
        int sch = 0;
        for (Klasse klasse : klassenInSchule) {
            for (Schueler schueler : klasse.getSchuelerInKlasse()) {
                if (name.equals(schueler.getName())) {
                    tg = schueler.getTaschengeld();
                    sch++;
                }
            }
        }

        return tg / sch;
    }

    @Override
    public String toString() {
        return "Schul-Name: " + bezeichnung;
    }
}
