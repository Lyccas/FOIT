package b_12FOIT.ii.figur;

public abstract class Figur {
    private String name;

    public Figur() {

    }

    public Figur(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getFlaeche();

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
