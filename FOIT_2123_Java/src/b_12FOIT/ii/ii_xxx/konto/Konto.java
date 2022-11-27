package b_12FOIT.ii.ii_xxx.konto;

import java.text.NumberFormat;

public class Konto {
    private String iban;
    private double kontostand;
    private double limit;
    private double dispo;

    public Konto(String iban, double kontostand, double dispo) {
        this.iban = iban;
        this.kontostand = kontostand;
        this.limit = 0;
        this.dispo = dispo;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getKontostandFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getKontostand());
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public String getLimitFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getLimit());
    }

    public void setDispo(double dispo) {
        this.dispo = dispo;
    }

    public double getDispo() {
        return dispo;
    }

    public String getDispoFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getDispo());
    }

    public void einzahlen(double einzahlen) {
        setKontostand(getKontostand() + einzahlen);
    }

    public void auszahlen(double auszahlen) {
        if (dispo > limit) {
            if (auszahlen > getKontostand() - getDispo()) {
                setKontostand(getKontostand());
            } else {
                setKontostand(getKontostand() - auszahlen);
            }
        } else {
            if (auszahlen < getKontostand() - getLimit()) {
                setKontostand(getKontostand());
            } else {
                setKontostand(getKontostand() - auszahlen);
            }
        }
    }
}
