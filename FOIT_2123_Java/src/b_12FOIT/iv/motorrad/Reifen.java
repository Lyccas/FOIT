package b_12FOIT.iv.motorrad;

public class Reifen {
    private double durchmesser;
    private double profiltiefe;
    private String jahreszeit;

    public Reifen(double durchmesser, double profiltiefe, String jahreszeit) {
        this.durchmesser = durchmesser;
        this.profiltiefe = profiltiefe;
        this.jahreszeit = jahreszeit;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getProfiltiefe() {
        return profiltiefe;
    }

    public String getJahreszeit() {
        return jahreszeit;
    }

    public void gibInfo() {
        System.out.println("Durchmesser: " + durchmesser);
        System.out.println("Profiltiefe: " + profiltiefe);
        System.out.println("Jahreszeit: " + jahreszeit);
    }

    @Override
    public String toString() {
        return jahreszeit + "-Reifen mit " + durchmesser + "cm Durchmesser und " + profiltiefe + "cm Profiltiefe";
    }
}
