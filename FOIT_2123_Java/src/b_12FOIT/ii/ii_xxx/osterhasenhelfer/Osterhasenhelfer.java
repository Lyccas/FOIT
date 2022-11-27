package b_12FOIT.ii.ii_xxx.osterhasenhelfer;

import java.text.NumberFormat;

public class Osterhasenhelfer {
    private String name;
    private double grundlohn;
    private boolean isOsterfan;
    private int gefaerbteEier;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrundlohn(double grundlohn) {
        this.grundlohn = grundlohn;
    }

    public double getGrundlohn() {
        return grundlohn;
    }

    public String getGrundlohnFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getGrundlohn());
    }

    public void setIsOsterfan(boolean isOsterfan) {
        this.isOsterfan = isOsterfan;
    }

    public boolean getIsOsterfan() {
        return isOsterfan;
    }

    public double getIsOsterfanBonus() {
        if (getIsOsterfan()) {
            return getGrundlohn() * 0.05;
        } else {
            return 0;
        }
    }

    public String getIsOsterfanBonusFormatiert() {
        if (getIsOsterfan()) {
            return "Du bist ein Osterfan :-) Fan-Zuschlag: " + getGrundlohn() * 0.05 + " Euro";
        } else {
            return "Du bist kein Osterfan :-( Fan-Zuschlag: 0 Euro";
        }
    }

    public void setGefaerbteEier(int gefaerbteEier) {
        this.gefaerbteEier = gefaerbteEier;
    }

    public int getGefaerbteEier() {
        return gefaerbteEier;
    }

    public double getGefaerbteEierBonus() {
        if (getGefaerbteEier() > 1000) {
            return getGefaerbteEier() * 0.2;
        } else if (getGefaerbteEier() > 800) {
            return getGefaerbteEier() * 0.15;
        } else if (getGefaerbteEier() > 400) {
            return getGefaerbteEier() * 0.10;
        } else {
            return 0;
        }
    }

    public double getGesamtlohn() {
        return getGrundlohn() + getIsOsterfanBonus() + getGefaerbteEierBonus();
    }

    public String getGesamtlohnFormatiert() {
        return NumberFormat.getCurrencyInstance().format(getGesamtlohn());
    }
}
