package b_12FOIT.vererbung;

public class Tier {
    private int alter;
    private String geschlecht;

    public Tier(int alter, String geschlecht) {
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String geraeucheMachen() {
        return "Tiergeräusche sind: ";
    }

    @Override
    public String toString() {
        return "Alter = " + alter + ", Geschlecht = " + geschlecht;
    }
}
