package b_12FOIT.iv.abteilung;

import java.text.NumberFormat;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private double gehalt;
    private int alter;
    private boolean leiter;
    private static int mitarbeiterGesamt;

    public Mitarbeiter() {
        mitarbeiterGesamt++;
    }

    public Mitarbeiter(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;

        mitarbeiterGesamt++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public String getGehaltFormatiert() {
        return NumberFormat.getCurrencyInstance().format(gehalt);
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isLeiter() {
        return leiter;
    }

    public void setLeiter(boolean leiter) {
        this.leiter = leiter;
    }

    public static int getMitarbeiterGesamt() {
        return mitarbeiterGesamt;
    }
}
