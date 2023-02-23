package b_12FOIT.x_klassenarbeit.kontinentLand;

public class Land {
    private String name;
    private double flaeche;
    private int einwohner;

    private Kontinent kontinent;

    public Land(String name, double flaeche, int einwohner) {
        this.name = name;
        this.flaeche = flaeche;
        this.einwohner = einwohner;
    }

    public Land(String name, double flaeche, int einwohner, Kontinent kontinent) {
        this.name = name;
        this.flaeche = flaeche;
        this.einwohner = einwohner;
        this.kontinent = kontinent;
    }

    public String getName() {
        return name;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public int getEinwohner() {
        return einwohner;
    }

    public Kontinent getKontinent() {
        return kontinent;
    }

    public void setKontinent(Kontinent kontinent) {
        this.kontinent = kontinent;
    }

    public int zeigeEinwohnerProQuadratkilometer() {
        return (int) (Math.round(einwohner / flaeche));
    }

    public double zeigeFlaechenanteil() {
        return Math.round(((flaeche / kontinent.getFlaeche()) * 100) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Flaeche: " + flaeche + "\n" +
                "Einwohner: " + einwohner + "\n" +
                "liegt auf: " + kontinent.getName();
    }
}
