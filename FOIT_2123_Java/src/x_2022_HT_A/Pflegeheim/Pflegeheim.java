package x_2022_HT_A.Pflegeheim;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Pflegeheim {
    private double enstandendeKosten;
    private ArrayList<Bewohner> bewohnerListe = new ArrayList<>();

    public Pflegeheim() {

    }

    public Pflegeheim(double enstandendeKosten) {
        this.enstandendeKosten = enstandendeKosten;
    }

    public Pflegeheim(double enstandendeKosten, ArrayList<Bewohner> bewohnerListe) {
        this.enstandendeKosten = enstandendeKosten;
        this.bewohnerListe = bewohnerListe;
    }

    public double getEnstandendeKosten() {
        return enstandendeKosten;
    }

    public void setEnstandendeKosten(double enstandendeKosten) {
        this.enstandendeKosten = enstandendeKosten;
    }

    public void addBewohner(Bewohner bewohner) {
        bewohnerListe.add(bewohner);
    }

    public ArrayList<Bewohner> getBewohner() {
        return bewohnerListe;
    }

    public double berechneEEE() {
        double pflegekassenErstattung = 0;
        for (Bewohner bewohner : bewohnerListe) {
            pflegekassenErstattung += bewohner.getPflegegrad().getPflegekassenBetrag();
        }
        return (enstandendeKosten - pflegekassenErstattung) / bewohnerListe.size();
    }

    public String berechneEEEFormat() {
        return NumberFormat.getCurrencyInstance().format(berechneEEE());
    }

    public String berechneEEETagFormat() {
        return NumberFormat.getCurrencyInstance().format(berechneEEE() / 30.42);
    }

    public String anzahlPflegegrad() {
        int grad1 = 0;
        int grad2 = 0;
        int grad3 = 0;
        int grad4 = 0;
        int grad5 = 0;
        for (Bewohner bewohner : bewohnerListe ) {
            switch (bewohner.getPflegegrad().getGrad()) {
                case 1:
                    grad1++;
                    break;
                case 2:
                    grad2++;
                    break;
                case 3:
                    grad3++;
                    break;
                case 4:
                    grad4++;
                    break;
                case 5:
                    grad5++;
                    break;
                default:
                    break;
            }
        }

        return "Pflegegrad 1: " + grad1 + "\n" +
                "Pflegegrad 2: " + grad2 + "\n" +
                "Pflegegrad 3: " + grad3 + "\n" +
                "Pflegegrad 4: " + grad4 + "\n" +
                "Pflegegrad 5: " + grad5;
    }

    public String avgPflegegrad() {
        double avg = 0;
        for (Bewohner bewohner : bewohnerListe) {
            avg += bewohner.getPflegegrad().getGrad();
        }

        return "Durschnittlicher Pflegegrad: " + avg / bewohnerListe.size();
    }

    public String toString() {
        return getBewohner().toString();
    }
}
