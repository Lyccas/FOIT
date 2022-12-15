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

    public boolean sucheVokabel(String wort) {
        boolean isVorhanden = false;
        for (int i = 0; i < meineListe.size(); i++) {
            isVorhanden = meineListe.get(i).equals(wort);
        }
        return isVorhanden;
    }
}
