package x_2022_HT_A.Pflegeheim;

public class Pflegegrad {
    private int grad;
    private double pflegekassenBetrag;

    public Pflegegrad() {

    }

    public Pflegegrad(int grad, double pflegekassenBetrag) {
        this.grad = grad;
        this.pflegekassenBetrag = pflegekassenBetrag;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public double getPflegekassenBetrag() {
        return pflegekassenBetrag;
    }

    public void setPflegekassenBetrag(double pflegekassenBetrag) {
        this.pflegekassenBetrag = pflegekassenBetrag;
    }

    public String toString() {
        return "Pflegegrad: " + grad;
    }
}
