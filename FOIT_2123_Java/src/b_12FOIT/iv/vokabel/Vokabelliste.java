package b_12FOIT.iv.vokabel;

import java.util.ArrayList;

public class Vokabelliste {
    private String thema;

    private ArrayList<Vokabel> meineListe = new ArrayList<>();

    public Vokabelliste() {

    }

    public void addVokabel(Vokabel vokabel) {
        meineListe.add(vokabel);
    }

    public Vokabel getVokabel(int index) {
        return meineListe.get(index);
    }

    public int getAnzahlVokabeln() {
        return Vokabel.getAnzahlVokabeln();
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public boolean sucheDeutschVokabel(String deutsch) {
        for (Vokabel vokabel : meineListe) {
            if(vokabel.getDeutscheswort().equals(deutsch)) {
                return true;
            }
        }

        return false;
    }

    public boolean sucheEnglischVokabel(String englisch) {
        for (Vokabel vokabel : meineListe) {
            if(vokabel.getDeutscheswort().equals(englisch)) {
                return true;
            }
        }

        return false;
    }

    public String gibDeutschUebersetzung(String deutsch) {
        if (!sucheDeutschVokabel(deutsch)) {
            return null;
        } else {
            for (Vokabel vokabel : meineListe) {
                if (vokabel.getDeutscheswort().equals(deutsch)) {
                    return vokabel.getEnglischeswort();
                }
            }
        }

        return null;
    }

    public String gibEnglischUebersetzung(String englisch) {
        if (!sucheDeutschVokabel(englisch)) {
            return null;
        } else {
            for (Vokabel vokabel : meineListe) {
                if (vokabel.getEnglischeswort().equals(englisch)) {
                    return vokabel.getDeutscheswort();
                }
            }
        }

        return null;
    }

    public String gibZufaelligDeutschWort() {

    }
}
