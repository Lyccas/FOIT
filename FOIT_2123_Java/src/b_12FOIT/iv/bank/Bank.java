package b_12FOIT.iv.bank;

import java.util.ArrayList;

public class Bank {
    private String filialbezeichnung;

    private ArrayList<Konto> kontoListe;

    public Bank(String filialbezeichnung) {
        this.filialbezeichnung = filialbezeichnung;

        kontoListe = new ArrayList<>();
    }

    public String getFilialbezeichnung() {
        return filialbezeichnung;
    }

    public void setFilialbezeichnung(String filialbezeichnung) {
        this.filialbezeichnung = filialbezeichnung;
    }

    public void addKonto(Konto k) {
        kontoListe.add(k);
    }

    public void removeKonto(int index) {
        kontoListe.remove(index);
    }

    public void showKonto(int index) {
        System.out.println(kontoListe.get(index));
    }

    public int gebeAnzahlKonten() {
        return kontoListe.size();
    }

    public double errechneBankguthaben() {
        double guthaben = 0;
        for (int i = 0; i < kontoListe.size(); i++) {
            guthaben = guthaben + kontoListe.get(i).getKontostand();
        }

        return guthaben;
    }

    public boolean sucheKonto(Konto k) {
        return kontoListe.contains(k);
    }

    public boolean sucheKonto(String iban) {
        for (int i = 0; i < kontoListe.size(); i++) {
            if (kontoListe.get(i).getIban().equals(iban)) {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Konto> getPositiveKonten() {
        ArrayList<Konto> konto = new ArrayList<>();
        for (int i = 0; i < kontoListe.size(); i++) {
            if (konto.get(i).getKontostand() > 0) {
                konto.add(kontoListe.get(i));
            }
        }

        return konto;
    }

    public ArrayList<Konto> sucheKontostand(double kontostand) {
        ArrayList<Konto> konto = new ArrayList<>();
        for (int i = 0; i < kontoListe.size(); i++) {
            if (konto.get(i).getKontostand() == kontostand) {
                konto.add(kontoListe.get(i));
            }
        }

        return konto;
    }

    public double getAVG() {
        double gesamt = 0;
        for (int i = 0; i < kontoListe.size(); i++) {
            gesamt = gesamt + kontoListe.get(i).getKontostand();
        }

        return gesamt / kontoListe.size();
    }

    public double getKontohoechsterStand() {
        double kontostand = kontoListe.get(0).getKontostand();
        for (int i = 0; i < kontoListe.size(); i++) {
            if (kontostand < kontoListe.get(i).getKontostand()) {
                kontostand += kontoListe.get(i).getKontostand();
            }
        }

        return kontostand;
    }

    public double getNiedrigstenKontostand() {
        double kontostand = kontoListe.get(0).getKontostand();
        for (int i = 0; i < kontoListe.size(); i++) {
            if (kontostand > kontoListe.get(i).getKontostand()) {
                kontostand -= kontoListe.get(i).getKontostand();
            }
        }

        return kontostand;
    }
}
