package b_12FOIT.x_klassenarbeit.mitarbeiterFiliale;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Filiale {
    private String name;

    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public ArrayList<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    public void erstellenUndHinzufuegenMitarbeiter(String name, String vorname, String geschlecht, double gehalt, boolean al) {
        mitarbeiterListe.add(new Mitarbeiter(name, vorname, geschlecht, gehalt, al));
    }

    public String zeigeAvgGehalt() {
        double gehalt = 0;
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            gehalt += mitarbeiter.getGehalt();
        }

        return NumberFormat.getCurrencyInstance().format(gehalt / mitarbeiterListe.size());
    }
    
    public Mitarbeiter zeigeBestbezahltestenMitarbeiter() {
        Mitarbeiter best = mitarbeiterListe.get(0);
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.getGehalt() > best.getGehalt()) {
                best = mitarbeiter;
            }
        }

        return best;
    }

    public ArrayList<Mitarbeiter> zeigeAlleAL() {
        ArrayList<Mitarbeiter> als = new ArrayList<>();
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.isAbteilungsleiter()) {
                als.add(mitarbeiter);
            }
        }

        return als;
    }

    public ArrayList<Mitarbeiter> zeigeMitarbeiterinnen(double betrag) {
        ArrayList<Mitarbeiter> mitarbeiterinnen = new ArrayList<>();
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.getGeschlecht().equals("weiblich") && mitarbeiter.getGehalt() > betrag) {
                mitarbeiterinnen.add(mitarbeiter);
            }
        }

        return mitarbeiterinnen;
    }
}
