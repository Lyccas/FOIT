package b_12FOIT.iv.buch;

public class Seite {
    private int seitenzahl;
    private String text;

    public Seite(int seitenzahl, String text) {
        this.seitenzahl = seitenzahl;
        this.text = text;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Seite: " + seitenzahl + "\n" +
                text;
    }
}
