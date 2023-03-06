package x_2021_HT_C;

public class Tierart {
    private String bezeichnung;
    private double futtermenge;
    private int fuetterungen;

    public Tierart() {
    }

    public Tierart(String bezeichnung, double futtermenge, int fuetterungen) {
        this.bezeichnung = bezeichnung;
        this.futtermenge = futtermenge;
        this.fuetterungen = fuetterungen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getFuttermenge() {
        return futtermenge;
    }

    public void setFuttermenge(double futtermenge) {
        this.futtermenge = futtermenge;
    }

    public int getFuetterungen() {
        return fuetterungen;
    }

    public void setFuetterungen(int fuetterungen) {
        this.fuetterungen = fuetterungen;
    }

    public String futtermengeProWoche(String bezeichnung) {
        if (this.bezeichnung.equals(bezeichnung)) {
            return "Die Tiertart " + bezeichnung + " benötigt " + futtermenge * fuetterungen + "kg Futter pro Woche";
        }

        return null;
    }
}
