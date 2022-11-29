package b_12FOIT.iv.motorrad;

public class Motorrad {
    private Motor motor;
    private Reifen[] reifen;

    public Motorrad(Motor motor, Reifen vorne, Reifen hinten) {
        this.motor = motor;

        reifen = new Reifen[2];
        reifen[0] = vorne;
        reifen[1] = hinten;
    }

    public Motor getMotor() {
        return motor;
    }

    public Reifen getVorderreifen() {
        return reifen[0];
    }

    public Reifen getHinterreifen() {
        return reifen[1];
    }

    public void gibInfo() {
        System.out.println("Motor:");
        motor.gibInfo();
        System.out.println("Reifen:");
        for (int i = 0; i < reifen.length; i++) {
            reifen[i].gibInfo();
        }
    }

    @Override
    public String toString() {
        return "Motorrad mit einem " + motor + " und vorne einem " + getVorderreifen() + " und hinten einem " + getHinterreifen();
    }
}
