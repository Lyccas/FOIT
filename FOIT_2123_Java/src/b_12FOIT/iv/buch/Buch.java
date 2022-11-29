package b_12FOIT.iv.buch;

import java.util.Arrays;

public class Buch {
    private String title;

    private Seite[] seite;

    public Buch(String title, Seite seite1, Seite seite2, Seite seite3, Seite seite4, Seite seite5) {
        this.title = title;

        seite = new Seite[5];
        seite[0] = seite1;
        seite[1] = seite2;
        seite[2] = seite3;
        seite[3] = seite4;
        seite[4] = seite5;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        int ausgabe = 0;
        for (int i = 0; i < seite.length; i++) {
            ausgabe = ausgabe + i;
        }
        return title + seite[ausgabe];
    }
}
