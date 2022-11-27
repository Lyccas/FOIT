package b_12FOIT.ii.ii_xx.personenwaage;

public class Person {
    private double groesse;
    private double gewicht;

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getIdealgewicht() {
        return  (getGroesse() - 100) * 0.9;
    }

    public String getGewichtsmeldung() {
        if (getGewicht() == getIdealgewicht()) {
            return  "Du hast Idealgewicht";
        } else if (getGewicht() < getIdealgewicht()) {
            return  "Du hast Untergewicht";
        } else if (getGewicht() > getIdealgewicht()) {
            return "Du hast Übergewicht";
        } else {
            return "Wir konnten keine Gewichtsmeldung berechnen";
        }
    }
}
