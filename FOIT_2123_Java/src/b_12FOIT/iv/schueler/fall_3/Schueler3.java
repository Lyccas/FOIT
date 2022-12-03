package b_12FOIT.iv.schueler.fall_3;

public class Schueler3 {
    private String vorname;
    private String nachname;
    private int alter;

    private Klasse3 meineKlasse;

    public Schueler3(String vorname, String nachname, int alter, Klasse3 meineKlasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.meineKlasse = meineKlasse;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public Klasse3 getMeineKlasse() {
        return meineKlasse;
    }

    @Override
    public String toString() {
        return meineKlasse + "\n" +
                "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Alter: " + alter;
    }
}
