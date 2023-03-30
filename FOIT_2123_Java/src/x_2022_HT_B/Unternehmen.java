package x_2022_HT_B;

import java.util.ArrayList;

public class Unternehmen {
    private String namen;
    private Personalverwaltung personalverwaltung;
    private ArrayList<Personal> personalListe = new ArrayList<>();

    public Unternehmen() {

    }

    public Unternehmen(String namen, Personalverwaltung personalverwaltung, ArrayList<Personal> personalListe) {
        this.namen = namen;
        this.personalverwaltung = personalverwaltung;
        this.personalListe = personalListe;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public Personalverwaltung getPersonalverwaltung() {
        return personalverwaltung;
    }

    public void setPersonalverwaltung(Personalverwaltung personalverwaltung) {
        this.personalverwaltung = personalverwaltung;
    }

    public ArrayList<Personal> getPersonalListe() {
        return personalListe;
    }

    public void addPersonalliste(Personal personal) {
        personalListe.add(personal);
    }

    public void setLohndaten(String personalnummer, int arbeitsstunden, int beratungen) {
        String pnr;
        for (Personal p : personalListe) {
            if (p.checkPersonalnummer(personalnummer)) {
            }
        }

        for (Personal p : personalListe) {

        }
    }
}
