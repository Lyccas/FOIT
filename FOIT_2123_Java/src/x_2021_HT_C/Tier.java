package x_2021_HT_C;

public class Tier {
    private String name;
    private int alter;

    private Tierart tierart;

    public Tier() {
    }

    public Tier(String name, int alter, Tierart tierart) {
        this.name = name;
        this.alter = alter;
        this.tierart = tierart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
