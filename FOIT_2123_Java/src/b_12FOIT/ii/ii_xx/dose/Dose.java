package b_12FOIT.ii.ii_xx.dose;

public class Dose {
    private double u;
    private double h;

    public void setU(double u) {
        this.u = u;
    }

    public double getU() {
        return u;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double getD_boden() {
        return getU() / Math.PI;
    }

    public double getF_boden() {
        return Math.PI * Math.pow((getD_boden() / 2), 2);
    }

    public double getF_mantel() {
        return getU() * getH();
    }

    public double getF_gesamt() {
        return 2 * getF_boden() + getF_mantel();
    }

    public double getV() {
        return getF_boden() * getH();
    }
}
