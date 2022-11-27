package b_12FOIT.ii.figur;

public class Rechteck extends Figur {
    private double seiteA;
    private double seiteB;

    public Rechteck() {

    }

    public Rechteck(String name, double seiteA, double seiteB) {
        super(name);
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }

    public double getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }

    @Override
    public double getFlaeche() {
        return seiteA * seiteB;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seite 1: " + seiteA + ", Seite 2: " + seiteB + ", Flächeninhalt: " + getFlaeche();
    }
}
