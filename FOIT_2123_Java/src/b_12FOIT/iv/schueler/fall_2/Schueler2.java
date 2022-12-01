package b_12FOIT.iv.schueler.fall_2;

public class Schueler2 {
    private String vorname;
    private String nachname;
    private int alter;

    public Schueler2(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
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

    @Override
    public String toString() {
        return "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Alter: " + alter;
    }
}
