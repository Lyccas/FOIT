package b_12FOIT.iv.iv_xx.stadtBundesland;

public class Bundesland {
    private String name;
    private int einwohner;

    private Stadt hauptstadt;

    public Bundesland(String name, int einwohner) {
        this.name = name;
        this.einwohner = einwohner;
    }

    public String getName() {
        return name;
    }

    public int getEinwohner() {
        return einwohner;
    }

    public void setHauptstadt(Stadt hauptstadt) {
        this.hauptstadt = hauptstadt;
    }

    public Stadt getHauptstadt() {
        return hauptstadt;
    }

    @Override
    public String toString() {
        return name + ", " + einwohner + ", " + hauptstadt.getName();
    }
}
