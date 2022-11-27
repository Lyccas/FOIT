package b_12FOIT.iv.iv_x.schuelerSchulklasse;

public class Schueler {
    private String name;
    private Schulklasse schulklasse;

    private Schueler() {

    }

    public Schueler(String name, Schulklasse schulklasse) {
        this.name = name;
        this.schulklasse = schulklasse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schulklasse getSchulklasse() {
        return schulklasse;
    }

    public void setSchulklasse(Schulklasse schulklasse) {
        this.schulklasse = schulklasse;
    }

    @Override
    public String toString() {
        return name + "\n" +
                getSchulklasse().getBezeichnung();
    }
}
