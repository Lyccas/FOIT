package b_12FOIT.x_klassenarbeit.weihnachtsbaum;

public class Weihnachtsbaum {
    private String standort;
    private int mantellaenge;
    private int durchmesser;
    public final static String TITEL = "Weihnachtsbaum";

    public Weihnachtsbaum(String standort, int mantellaenge, int durchmesser) {
        this.standort = standort;
        this.mantellaenge = mantellaenge;
        this.durchmesser = durchmesser;
    }

    public String getStandort() {
        return standort;
    }

    public int berechneFlaecheninhalt() {
        int radius = durchmesser / 2;
        return (int) (Math.round(((Math.pow(radius, 2) * Math.PI) + radius * Math.PI * mantellaenge) * 100) / 100);
    }

    public int berechneLampen() {
        return berechneFlaecheninhalt() * 2;
    }
}
