package b_12FOIT.iv.schueler.fall_3;

import java.util.ArrayList;

public class Klasse3 {
    private String bezeichnung;
    private int raumnummer;

    private ArrayList<Schueler3> schueler3ArrayList;

    public Klasse3(String bezeichnung, int raumnummer) {
        this.bezeichnung = bezeichnung;
        this.raumnummer = raumnummer;

        schueler3ArrayList = new ArrayList<Schueler3>();
    }

    public void schuelerHinzufuegen(Schueler3 schueler) {
        schueler3ArrayList.add(schueler);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    public ArrayList<Schueler3> getSchueler3ArrayList() {
        return schueler3ArrayList;
    }

    public Schueler3 getSchueler(int index) {
        return schueler3ArrayList.get(index);
    }

    @Override
    public String toString() {
        return "Klassenname: " + bezeichnung + "\n" +
                "Raumnummer: " + raumnummer;
    }
}