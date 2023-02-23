package b_12FOIT.x_klassenarbeit.filialeMitarbeiter;

import java.text.NumberFormat;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private String geschlecht;
    private double gehalt;
    private boolean abteilungsleiter;

    private static int anzahlMitarbeiter;

    public Mitarbeiter(String name, String vorname, String geschlecht, double gehalt, boolean abteilungsleiter) {
        this.name = name;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
        this.gehalt = gehalt;
        this.abteilungsleiter = abteilungsleiter;

        anzahlMitarbeiter++;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public double getGehalt() {
        return gehalt;
    }

    public boolean isAbteilungsleiter() {
        return abteilungsleiter;
    }

    public static int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public static void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        Mitarbeiter.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + vorname + "\n" +
                "Geschlecht: " + geschlecht + "\n" +
                "Gehalt: " + NumberFormat.getCurrencyInstance().format(gehalt) + "\n" +
                "Abteilungsleiter: " + abteilungsleiter;
    }
}
