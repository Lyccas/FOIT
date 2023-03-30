package x_2022_HT_B;

public class Personalverwaltung {
    private int personalbestand;
    private int abgangRuhestand;
    private int abgangElternzeit;
    private int abgangSonstig;
    private int zugangElternzeit;
    private int zugangUebernahme;
    private int zugangSonstig;
    private int planFreisetzung;
    private int planNeueinstellung;

    public Personalverwaltung() {

    }

    public Personalverwaltung(int personalbestand, int abgangRuhestand, int abgangElternzeit, int abgangSonstig, int zugangElternzeit, int zugangUebernahme, int zugangSonstig, int planFreisetzung, int planNeueinstellung) {
        this.personalbestand = personalbestand;
        this.abgangRuhestand = abgangRuhestand;
        this.abgangElternzeit = abgangElternzeit;
        this.abgangSonstig = abgangSonstig;
        this.zugangElternzeit = zugangElternzeit;
        this.zugangUebernahme = zugangUebernahme;
        this.zugangSonstig = zugangSonstig;
        this.planFreisetzung = planFreisetzung;
        this.planNeueinstellung = planNeueinstellung;
    }

    public int getPersonalbestand() {
        return personalbestand;
    }

    public void setPersonalbestand(int personalbestand) {
        this.personalbestand = personalbestand;
    }

    public int getAbgangRuhestand() {
        return abgangRuhestand;
    }

    public void setAbgangRuhestand(int abgangEuhestand) {
        this.abgangRuhestand = abgangEuhestand;
    }

    public int getAbgangElternzeit() {
        return abgangElternzeit;
    }

    public void setAbgangElternzeit(int abgangElternzeit) {
        this.abgangElternzeit = abgangElternzeit;
    }

    public int getAbgangSonstig() {
        return abgangSonstig;
    }

    public void setAbgangSonstig(int abgangSonstig) {
        this.abgangSonstig = abgangSonstig;
    }

    public int getZugangElternzeit() {
        return zugangElternzeit;
    }

    public void setZugangElternzeit(int zugangElternzeit) {
        this.zugangElternzeit = zugangElternzeit;
    }

    public int getZugangUebernahme() {
        return zugangUebernahme;
    }

    public void setZugangUebernahme(int zugangUebernahme) {
        this.zugangUebernahme = zugangUebernahme;
    }

    public int getZugangSonstig() {
        return zugangSonstig;
    }

    public void setZugangSonstig(int zugangSonstig) {
        this.zugangSonstig = zugangSonstig;
    }

    public int getPlanFreisetzung() {
        return planFreisetzung;
    }

    public void setPlanFreisetzung(int planFreisetzung) {
        this.planFreisetzung = planFreisetzung;
    }

    public int getPlanNeueinstellung() {
        return planNeueinstellung;
    }

    public void setPlanNeueinstellung(int planNeueinstellung) {
        this.planNeueinstellung = planNeueinstellung;
    }

    public int personalbestandNachAbgang() {
        return personalbestand - abgangRuhestand - abgangElternzeit - abgangSonstig;
    }

    public int personalbestandNachZugang() {
        return personalbestandNachAbgang() + zugangElternzeit + zugangUebernahme + zugangSonstig;
    }

    public int benoetigteMitarbeiter(int beschwerdefaelle) {
        return (int) Math.round(beschwerdefaelle / 14.0);
    }
}