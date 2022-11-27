package b_12FOIT.iv.iv_x.hundRasse;

public class Hund {
    private String name;
    private int alter;
    private Rasse rasse;

    public Hund() {

    }

    public Hund(String name, int alter, Rasse rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
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

    public Rasse getRasse() {
        return rasse;
    }

    public void setRasse(Rasse rasse) {
        this.rasse = rasse;
    }

    @Override
    public String toString() {
        return name + ", " + alter + "Jahre \n" +
                getRasse().getName();
    }
}
