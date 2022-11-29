package b_12FOIT.iv.motorrad;

public class Motor {
    private int leistung;
    private double hubraum;

    public Motor(int leistung, double hubraum) {
        this.leistung = leistung;
        this.hubraum = hubraum;
    }

    public int getLeistung() {
        return leistung;
    }

    public double getHubraum() {
        return hubraum;
    }

    public void gibInfo() {
        System.out.println("Leistung: " + leistung);
        System.out.println("Hubraum: " + hubraum);
    }

    @Override
    public String toString() {
        return "Motor mir " + leistung + "PS und " + hubraum + " Liter Hubraum";
    }
}
