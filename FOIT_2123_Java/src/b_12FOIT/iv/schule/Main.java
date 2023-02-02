package b_12FOIT.iv.schule;

import java.util.ArrayList;

public class Main {
    static ArrayList<Schule> schulen = new ArrayList<Schule>();

    public static void main(String[] args) {
        Schule bsu = new Schule("BSU");
        Schule abd = new Schule("ABD");

        schulen.add(bsu);
        schulen.add(abd);

        Klasse foit11 = new Klasse("11FOIT");
        Klasse foit12 = new Klasse("12FOIT");
        Klasse hbfi11 = new Klasse("11HBFI");
        Klasse hbfi12 = new Klasse("12HBFI");

        bsu.addKlasse(foit11);
        bsu.addKlasse(foit12);
        abd.addKlasse(hbfi11);
        abd.addKlasse(hbfi12);

        Schueler mari = new Schueler("Mari", 80);
        Schueler paul = new Schueler("Paul", 95);
        Schueler duerr1 = new Schueler("Dürr", 88);
        Schueler alst = new Schueler("Alst", 120);
        Schueler duerr2 = new Schueler("Dürr", 100);
        Schueler morr = new Schueler("Morr", 112);
        Schueler bey = new Schueler("Bey", 99);
        Schueler gros = new Schueler("Gros", 200);
        Schueler crei = new Schueler("Crei", 78);
        Schueler goody = new Schueler("Goody", 108);
        Schueler fey = new Schueler("Fey", 85);

        foit11.addSchueler(mari);
        foit11.addSchueler(paul);
        foit11.addSchueler(duerr1);
        foit12.addSchueler(alst);
        foit12.addSchueler(duerr2);
        foit12.addSchueler(morr);
        hbfi11.addSchueler(bey);
        hbfi11.addSchueler(gros);
        hbfi12.addSchueler(crei);
        hbfi12.addSchueler(goody);
        hbfi12.addSchueler(fey);
    }

    private static double niedrigstesTg() {
        double tg = schulen.get(0).niedrigstesTg();
        for (Schule schule : schulen) {
            if (schule.niedrigstesTg() < tg) {
                tg = schule.niedrigstesTg();
            }
        }

        return tg;
    }
}
