package b_12FOIT.iv.iv_xx.stadtBundesland;

public class Stadt {
    private String name;
    private int einwohner;
    private Bundesland bundesland;

    public Stadt(String name, int einwohner, Bundesland bundesland) {
        this.name = name;
        this.einwohner = einwohner;
        this.bundesland = bundesland;
    }

    public String getName() {
        return name;
    }

    public int getEinwohner() {
        return einwohner;
    }

    public Bundesland getBundesland() {
        return bundesland;
    }

    public double zeigeAnteilAnEinwohnern() {
        return Math.round(((100.0 / bundesland.getEinwohner()) * einwohner) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return name + ", " + einwohner + " Einwohner, " + zeigeAnteilAnEinwohnern() + "%\n" +
                getBundesland().toString();
    }
}
