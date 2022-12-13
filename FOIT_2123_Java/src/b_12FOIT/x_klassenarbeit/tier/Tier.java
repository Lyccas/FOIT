package b_12FOIT.x_klassenarbeit.tier;

public class Tier {
    private String name;
    private double stuecklohn;

    public Tier(String name, double stuecklohn) {
        this.name = name;
        this.stuecklohn = stuecklohn;
    }

    public String getName() {
        return name;
    }

    public double getStuecklohn() {
        return stuecklohn;
    }

    public double errechneGehalt(int anzahl) {
        return 0;
    }
}
