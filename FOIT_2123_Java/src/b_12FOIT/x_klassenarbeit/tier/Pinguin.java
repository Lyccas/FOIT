package b_12FOIT.x_klassenarbeit.tier;

public class Pinguin extends Tier {
    private boolean gutGelaunt;

    public Pinguin(String name, double stuecklohn,boolean gutGelaunt) {
        super(name, stuecklohn);
        this.gutGelaunt = gutGelaunt;
    }

    @Override
    public double errechneGehalt(int anzahl) {
        if (gutGelaunt) {
            return (getStuecklohn() * anzahl) * 1.2;
        } else {
            return (getStuecklohn() * anzahl) * 0.9;
        }
    }
}
