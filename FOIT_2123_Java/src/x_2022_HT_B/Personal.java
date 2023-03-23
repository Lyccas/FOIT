package x_2022_HT_B;

import java.text.NumberFormat;

public class Personal {
    private String personalnummer;
    private double stundenlohn;
    private double praemieBeratung;
    private int arbeitsstunden;
    private int beratungen;

    public Personal() {

    }

    public Personal(String personalnummer, double stundenlohn, double praemieBeratung) {
        this.personalnummer = personalnummer;
        this.stundenlohn = stundenlohn;
        this.praemieBeratung = praemieBeratung;
    }

    public String getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(String personalnummer) {
        this.personalnummer = personalnummer;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public String getStundenlohnFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getStundenlohn());
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getPraemieBeratung() {
        return praemieBeratung;
    }

    public String getPraemieBeratungFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getPraemieBeratung());
    }

    public void setPraemieBeratung(double praemieBeratung) {
        this.praemieBeratung = praemieBeratung;
    }

    public int getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setArbeitsstunden(int arbeitsstunden) {
        this.arbeitsstunden = arbeitsstunden;
    }

    public int getBeratungen() {
        return beratungen;
    }

    public void setBeratungen(int beratungen) {
        this.beratungen = beratungen;
    }

    public boolean checkPersonalnummer(String personalnummer) {
        return personalnummer.equals(this.personalnummer);
    }

    public void checkArbeitsstunden(int arbeitsstunden) {
        if (arbeitsstunden > 170) {
            System.out.println("Diese Arbeitsstunden sind zu hoch! \n" +
                    "Bitte erneute Eingabe!");
        }
    }

    public String toString() {
        return "\nPersonalnummer: " + personalnummer + ", Stundenlohn: " + getStundenlohnFormatiert() + ", Prämie pro Beratung: " + getPraemieBeratungFormatiert();
    }
}
