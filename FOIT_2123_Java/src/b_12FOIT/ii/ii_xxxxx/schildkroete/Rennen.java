package b_12FOIT.ii.ii_xxxxx.schildkroete;

import java.util.ArrayList;

public class Rennen {
    private ArrayList<Schildkroete> teilnehmer = new ArrayList<Schildkroete>();

    public Rennen() {

    }

    public ArrayList<Schildkroete> getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(ArrayList<Schildkroete> teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    public void addSchildkroete(Schildkroete schildkroete) {
        teilnehmer.add(schildkroete);
    }

    public Schildkroete ermittleGewinner() {
        Schildkroete gewinner = teilnehmer.get(0);
        for (Schildkroete schildkroete : teilnehmer) {
            if (schildkroete.getStrecke() > gewinner.getStrecke()) {
                gewinner = schildkroete;
            }
        }

        return gewinner;
    }

    public Schildkroete aeltesteSchildkroete() {
        Schildkroete aelteste = teilnehmer.get(0);
        for (Schildkroete schildkroete : teilnehmer) {
            if (schildkroete.getAlter() > aelteste.getAlter()) {
                aelteste = schildkroete;
            }
        }

        return aelteste;
    }

    public Schildkroete juengsteSchildkroete() {
        Schildkroete juengste = teilnehmer.get(0);
        for (Schildkroete schildkroete : teilnehmer) {
            if (schildkroete.getAlter() < juengste.getAlter()) {
                juengste = schildkroete;
            }
        }

        return juengste;
    }

    public Schildkroete schnellsteSchildkroete() {
        Schildkroete schnellste = teilnehmer.get(0);
        for (Schildkroete schildkroete : teilnehmer) {
            if (schildkroete.getMaxSpeed() > schnellste.getMaxSpeed()) {
                schnellste = schildkroete;
            }
        }

        return schnellste;
    }

    public Schildkroete langsamsteSchildkroete() {
        Schildkroete langsamste = teilnehmer.get(0);
        for (Schildkroete schildkroete : teilnehmer) {
            if (schildkroete.getMaxSpeed() < langsamste.getMaxSpeed()) {
                langsamste = schildkroete;
            }
        }

        return langsamste;
    }
}
