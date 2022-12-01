package b_12FOIT.iv.schueler.fall_2;

import java.util.ArrayList;

public class Klasse2 {
    private String bezeichnung;
    private int raumnummer;

    private ArrayList<Schueler2> schueler2ArrayList;

    public Klasse2(String bezeichnung, int raumnummer) {
        this.bezeichnung = bezeichnung;
        this.raumnummer = raumnummer;

        schueler2ArrayList = new ArrayList<Schueler2>();
    }

    public void schuelerHinzufuegen(Schueler2 schueler) {
        schueler2ArrayList.add(schueler);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    public ArrayList<Schueler2> getSchueler2ArrayList() {
        return schueler2ArrayList;
    }

    public Schueler2 getSchueler(int index) {
        return schueler2ArrayList.get(index);
    }
}
