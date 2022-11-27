package b_12FOIT.ii.ii_xxxxx.schildkroete;

import java.util.Random;

public class Schildkroete {
    Random random = new Random();

    private String name;
    private int alter;
    private int energiepunkte = 10;
    private int maxSpeed;
    private int strecke;

    public Schildkroete(String name, int alter, int maxSpeed) {
        this.name = name;
        this.alter = alter;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public int getEnergiepunkte() {
        return energiepunkte;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getStrecke() {
        return strecke;
    }

    public void krieche() {
        if (alter <= 40) {
            energiepunkte = energiepunkte - 2;
        } else if (alter <= 80) {
            energiepunkte = energiepunkte - 1;
        }
        strecke = strecke + random.nextInt(maxSpeed);
    }

    public void tanken(int energie) {
        if (energie == 4) {
            energiepunkte = energiepunkte + 4;
        } else if (energie == 9) {
            energiepunkte = energiepunkte + 9;
        } else {
            System.out.println("Dies ist kein gültiger Wert.");
        }
    }

    public boolean isTankLeer(int energie, int alter) {
        if (alter <= 40) {
            return energie < 2;
        } else if (alter <= 80) {
            return energie < 1;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Schildkröte: \t\t\t\t" + name + "\n" +
                "Alter: \t\t\t\t\t\t" + alter + "\n" +
                "Energiepunkte: \t\t\t\t" + energiepunkte + "\n" +
                "maximale Geschwindigkeit: \t" + maxSpeed + "\n" +
                "Strecke: \t\t\t\t\t" + strecke;
    }
}
