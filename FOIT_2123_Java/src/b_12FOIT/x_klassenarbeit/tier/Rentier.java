package b_12FOIT.x_klassenarbeit.tier;

public class Rentier extends Tier {
    public Rentier(String name) {
        super(name, 5);
    }

    @Override
    public double errechneGehalt(int anzahl) {
        return getStuecklohn() * anzahl;
    }
}
