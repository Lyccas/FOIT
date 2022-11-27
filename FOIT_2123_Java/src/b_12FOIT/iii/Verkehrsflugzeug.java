package b_12FOIT.iii;

public class Verkehrsflugzeug extends Flugzeug {
    private int passagiere;

    public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int passagiere) {
        super(hersteller, maxSpeed, 1);
        this.setImmatNummer(immatNummer);
        this.passagiere = passagiere;
    }

    public int getPassagiere() {
        return passagiere;
    }

    public void setPassagiere(int passagiere) {
        this.passagiere = passagiere;
    }

    @Override
    public boolean getLooping() {
        return false;
    }
}
