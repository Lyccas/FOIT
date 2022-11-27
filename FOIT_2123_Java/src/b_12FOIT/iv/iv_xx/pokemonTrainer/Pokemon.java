package b_12FOIT.iv.iv_xx.pokemonTrainer;

public class Pokemon {
    private String name;
    private int levelpunkte;
    private int level;
    private Trainer trainer;

    public Pokemon(String name, int levelpunkte, int level, Trainer trainer) {
        this.name = name;
        this.levelpunkte = levelpunkte;
        this.level = level;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public int getLevelpunkte() {
        return levelpunkte;
    }

    public int getLevel() {
        return level;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void erhoeheLP(int punkte) {
        levelpunkte = levelpunkte + punkte;
    }

    public void erhoeheLevel() {
        level = levelpunkte / 100;
    }
}
