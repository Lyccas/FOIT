package b_12FOIT.iv.mediakauf;

import java.util.ArrayList;

public class Filiale {
    private String name;

    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }
}
