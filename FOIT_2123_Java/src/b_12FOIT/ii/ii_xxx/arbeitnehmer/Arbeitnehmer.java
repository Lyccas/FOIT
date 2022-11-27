package b_12FOIT.ii.ii_xxx.arbeitnehmer;

public class Arbeitnehmer {
    private String name;
    private double grundgehalt;
    private int kinderanzahl;
    private boolean isVerheiratet;
    private boolean haustier;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setKinderanzahl(int kinderanzahl) {
        this.kinderanzahl = kinderanzahl;
    }

    public int getKinderanzahl() {
        return kinderanzahl;
    }

    public double getKinderBonus() {
        if (getKinderanzahl() == 1) {
            return getGrundgehalt() * 0.015;
        } else if (getKinderanzahl() == 2) {
            return getGrundgehalt() * 0.04;
        } else if (getKinderanzahl() >= 3) {
            return getGrundgehalt() * getKinderanzahl() * 0.025;
        } else {
            return 0;
        }
    }

    public void setIsVerheiratet(boolean isVerheiratet) {
        this.isVerheiratet = isVerheiratet;
    }

    public boolean getIsVerheiratet() {
        return isVerheiratet;
    }

    public double getIsVerheiratetBonus() {
        if (getIsVerheiratet()) {
            return getGrundgehalt() * 0.02;
        } else {
            return 0;
        }
    }

    public void setHaustier(boolean haustier) {
        this.haustier = haustier;
    }

    public boolean getHaustier() {
        return haustier;
    }

    public double getHaustierBonus() {
        if (getHaustier()) {
            return getGrundgehalt() * 0.01;
        }
        return 0;
    }

    public double getGesamtgehalt() {
        return getGrundgehalt() + getKinderBonus() + getIsVerheiratetBonus() + getHaustierBonus();
    }

    public String zeigeGesamtueberblick() {
        return getName() + "\t" + getGrundgehalt() + "\t" + getKinderanzahl();
    }
}
