package b_12FOIT.iv.schule;

public class Schueler {
    private String name;
    private double taschengeld;

    public Schueler(String name, double taschengeld) {
        this.name = name;
        this.taschengeld = taschengeld;
    }

    public String getName() {
        return name;
    }

    public double getTaschengeld() {
        return taschengeld;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Taschengeld: " + taschengeld;
    }
}
