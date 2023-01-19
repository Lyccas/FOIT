package b_12FOIT.iv.abteilung;

import java.util.ArrayList;

public class Abteilung {
    private String bezeichnung;

    private ArrayList<Mitarbeiter> abteilungsMitarbeiter = new ArrayList<Mitarbeiter>();

    public Abteilung() {

    }

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        abteilungsMitarbeiter.add(mitarbeiter);
    }

    public Mitarbeiter getMitarbeiter(int index) {
        return abteilungsMitarbeiter.get(index);
    }

    public ArrayList<Mitarbeiter> getAbteilungsMitarbeiter() {
        return abteilungsMitarbeiter;
    }

    public double gesamtesGehalt() {
        double gehalt = 0;
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            gehalt += mitarbeiter.getGehalt();
        }

        return gehalt;
    }

    public double durchschnittlichesGehalt() {
        double gehalt = 0;
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            gehalt += mitarbeiter.getGehalt();
        }

        return gehalt / abteilungsMitarbeiter.size();
    }

    public double geringstesGehalt() {
        double gehalt = abteilungsMitarbeiter.get(0).getGehalt();
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            if(gehalt > mitarbeiter.getGehalt()) {
                gehalt -= mitarbeiter.getGehalt();
            }
        }

        return gehalt;
    }

    public double durchschnittlichesAlter() {
        double alter = 0;
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            alter += mitarbeiter.getAlter();
        }

        return alter / abteilungsMitarbeiter.size();
    }

    public Mitarbeiter aeltesterMitarbeiter() {
        Mitarbeiter alter = new Mitarbeiter();
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            if (alter.getAlter() < mitarbeiter.getAlter()) {
                alter = mitarbeiter;
            }
        }

        return alter;
    }

    public int mitarbeiterMehrAls4000() {
        int anzahl = 0;
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            if (mitarbeiter.getGehalt() > 4000) {
                anzahl++;
            }
        }

        return anzahl;
    }

    public ArrayList<Mitarbeiter> mitarbeiterMehrAlsDouble(double gehalt) {
        ArrayList<Mitarbeiter> mitarbeiterGehalt = new ArrayList<Mitarbeiter>();
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            if (mitarbeiter.getGehalt() > gehalt) {
                mitarbeiterGehalt.add(mitarbeiter);
            }
        }

        return mitarbeiterGehalt;
    }

    public Mitarbeiter zeigeAbteilunsleiter() {
        Mitarbeiter abteilunsleiter = new Mitarbeiter();
        for (Mitarbeiter mitarbeiter : abteilungsMitarbeiter) {
            if (mitarbeiter.isLeiter()) {
                abteilunsleiter = mitarbeiter;
            }
        }

        return abteilunsleiter;
    }
}
