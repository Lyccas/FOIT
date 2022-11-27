package b_12FOIT.ii.figur;

public class Dreieck extends Figur {
    public double seiteA;
    public double seiteB;

    public Dreieck() {

    }

    public Dreieck(String name, double seiteA, double seiteB) {
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
        return (seiteA * seiteB) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grundseite: " + seiteA + ", Höhe: " + seiteB + ", Flächeninhalt: " + getFlaeche();
    }
}
