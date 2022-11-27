package b_12FOIT.iii;

abstract public class Doppeldecker extends Flugzeug {
    public static final int LOOPINGSPEED = 320;
    private final boolean offenesCockpit;

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
        super(hersteller, maxSpeed, 2);
        this.setImmatNummer(immatNummer);
        this.offenesCockpit = offenesCockpit;
    }

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
        super(hersteller, maxSpeed, 2);
        this.setImmatNummer(immatNummer);
        this.offenesCockpit = true;
    }

    public boolean isOffenesCockpit() {
        return offenesCockpit;
    }

    @Override
    public boolean getLooping() {
        return getMaxSpeed() > LOOPINGSPEED;
    }
}
