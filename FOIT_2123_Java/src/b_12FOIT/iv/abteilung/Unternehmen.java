package b_12FOIT.iv.abteilung;

import java.util.ArrayList;

public class Unternehmen {
    private String name;

    private ArrayList<Abteilung> abteilungsliste = new ArrayList<Abteilung>();

    public Unternehmen() {

    }

    public Unternehmen(String name) {
        this.name = name;
    }

    public double errechneGehalt() {
        double gehalt = 0;
        for (Abteilung abteilung : abteilungsliste) {
            gehalt += abteilung.gesamtesGehalt();
        }

        return gehalt;
    }

    public double durchschnittlichesGehalt() {
        return errechneGehalt() / abteilungsliste.size();
    }

    public double geringstesGehalt() {
        double gehalt = abteilungsliste.get(0).gesamtesGehalt();
        for (Abteilung abteilung : abteilungsliste) {
            if (gehalt > abteilung.gesamtesGehalt()) {
                gehalt -= abteilung.gesamtesGehalt();
            }
        }

        return gehalt;
    }

    public double durchschnittlichesAlter() {
        double alter = 0;
        for (Abteilung abteilung : abteilungsliste) {
            alter += abteilung.durchschnittlichesAlter();
        }

        return alter;
    }

    public Mitarbeiter aeltesterMitarbeiter() {
        Mitarbeiter alter = new Mitarbeiter();
        for (Abteilung abteilung : abteilungsliste) {
            alter = abteilung.aeltesterMitarbeiter();
        }

        return alter;
    }

    public int mehrAls4000() {
        int anzahl = 0;
        for (Abteilung abteilung : abteilungsliste) {
            abteilung.mitarbeiterMehrAls4000();
        }

        return anzahl;
    }

    public ArrayList<Abteilung> mehrAlsDouble(double gehalt) {
        ArrayList<Abteilung> abteilungen = new ArrayList<Abteilung>();
        for (Abteilung abteilung : abteilungsliste) {
            if (abteilung.gesamtesGehalt() > gehalt) {
                abteilungen.add(abteilung);
            }
        }

        return abteilungen;
    }

    public Mitarbeiter zeigeAbteilunsleiter() {
        Mitarbeiter abteilunsleiter = new Mitarbeiter();
        for (Abteilung abteilung : abteilungsliste) {
            abteilunsleiter = abteilung.zeigeAbteilunsleiter();
        }

        return abteilunsleiter;
    }
}
