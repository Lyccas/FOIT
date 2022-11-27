package b_12FOIT.ii.figur;

public class Kreis extends Figur {
    private double radius;

    public Kreis() {

    }

    public Kreis(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFlaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius + ", Flächeninhalt: " + getFlaeche();
    }
}
