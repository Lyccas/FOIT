package b_12FOIT.iv.schueler.fall_1;

public class Schueler1 {
    private String vorname;
    private String nachname;
    private int alter;

    private Klasse1 meineKlasse;

    public Schueler1(String vorname, String nachname, int alter, Klasse1 meineKlasse) {
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

    public Klasse1 getMeineKlasse() {
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
