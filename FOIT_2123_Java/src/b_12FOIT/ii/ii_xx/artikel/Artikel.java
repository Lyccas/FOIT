package b_12FOIT.ii.ii_xx.artikel;

import java.text.NumberFormat;

public class Artikel {
    private String bezeichnung;
    private double nettopreis;
    private int lagermenge;

    public Artikel(){

    }

    public Artikel(String bezeichnung, double nettopreis){
        this.bezeichnung = bezeichnung;
        this.nettopreis = nettopreis;
        this.lagermenge = 10;
    }

    public Artikel(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.nettopreis = 0.99;
        this.lagermenge = 10;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setNettopreis(double nettopreis) {
        this.nettopreis = nettopreis;
    }

    public double getNettopreis() {
        return nettopreis;
    }

    public double getLagerwertNetto() {
        return nettopreis * lagermenge;
    }

    public double getLagerwertBrutto() {
        return getLagerwertNetto() * 1.19;
    }

    public String getLagerwertNettoFormatiert(){
        return NumberFormat.getCurrencyInstance().format(getLagerwertNetto());
    }

    public String getLagerwertBruttoFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getLagerwertBrutto());
    }

    public void setLagermenge(int lagermenge) {
        this.lagermenge = lagermenge;
    }

    public int getLagermenge() {
        return lagermenge;
    }
}
