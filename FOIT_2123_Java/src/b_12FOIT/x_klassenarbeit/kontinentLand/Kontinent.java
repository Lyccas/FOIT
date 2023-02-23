package b_12FOIT.x_klassenarbeit.kontinentLand;

public class Kontinent {
    private String name;
    private double flaeche;

    public Kontinent(String name, double flaeche) {
        this.name = name;
        this.flaeche = flaeche;
    }

    public String getName() {
        return name;
    }

    public double getFlaeche() {
        return flaeche;
    }
}
