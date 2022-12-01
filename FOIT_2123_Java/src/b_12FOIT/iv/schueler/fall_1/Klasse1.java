package b_12FOIT.iv.schueler.fall_1;

public class Klasse1 {
    private String bezeichnung;
    private int raumnummer;

    public Klasse1(String bezeichnung, int raumnummer) {
        this.bezeichnung = bezeichnung;
        this.raumnummer = raumnummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    @Override
    public String toString() {
        return "Klassenname: " + bezeichnung + "\n" +
                "Raumnummer: " + raumnummer;
    }
}
