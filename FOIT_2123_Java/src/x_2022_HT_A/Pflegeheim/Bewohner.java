package x_2022_HT_A.Pflegeheim;

public class Bewohner {
    private String name;

    private Pflegegrad pflegegrad;

    public Bewohner() {

    }

    public Bewohner(String name, Pflegegrad pflegegrad) {
        this.name = name;
        this.pflegegrad = pflegegrad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pflegegrad getPflegegrad() {
        return pflegegrad;
    }

    public void setPflegegrad(Pflegegrad pflegegrad) {
        this.pflegegrad = pflegegrad;
    }

    public String toString() {
        return name + " " + getPflegegrad();
    }
}