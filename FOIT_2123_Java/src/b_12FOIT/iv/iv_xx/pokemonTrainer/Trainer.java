package b_12FOIT.iv.iv_xx.pokemonTrainer;

public class Trainer {
    private String name;
    private int alter;
    private boolean istGut;

    public Trainer(String name, int alter, boolean istGut) {
        this.name = name;
        this.alter = alter;
        this.istGut = istGut;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public boolean isIstGut() {
        return istGut;
    }
}
