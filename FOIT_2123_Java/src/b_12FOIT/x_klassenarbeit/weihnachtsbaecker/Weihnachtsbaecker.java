package b_12FOIT.x_klassenarbeit.weihnachtsbaecker;

import java.text.NumberFormat;

public class Weihnachtsbäcker {
    private String name;
    private double grundgehalt;
    private int anzahl;
    public static final String TITEL = "Meisterbäcker";

    public Weihnachtsbäcker(String name, double grundgehalt, int anzahl) {
        this.name = name;
        this.grundgehalt = grundgehalt;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public String zeigeGrundgehaltFormatiert() {
        return NumberFormat.getCurrencyInstance().format(grundgehalt);
    }

    public double errechnePlaetzchenzuschlag(int anzahl) {
        if (anzahl <= 100) {
            return anzahl * 0.05;
        } else if (anzahl <= 500) {
            return anzahl * 0.07;
        } else {
            return anzahl * 0.11;
        }
    }

    public double zeigeGesamtgehalt() {
        return grundgehalt + errechnePlaetzchenzuschlag(anzahl);
    }

    @Override
    public String toString() {
        return "Titel: " + TITEL + ", Name: " + name + ", Gesamtgehalt: " + NumberFormat.getCurrencyInstance().format(zeigeGesamtgehalt());
    }
}
