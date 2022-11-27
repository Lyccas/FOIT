package b_12FOIT.iii;

abstract public class Flugzeug {
    private String hersteller;
    private int maxSpeed;
    private String immatNummer;
    private int anzahlFluegel = 1;

    public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.anzahlFluegel = anzahlFluegel;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    protected void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    abstract public boolean getLooping();
}
