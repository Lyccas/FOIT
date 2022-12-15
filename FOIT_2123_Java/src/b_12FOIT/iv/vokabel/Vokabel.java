package b_12FOIT.iv.vokabel;

public class Vokabel {
    private String deutscheswort;
    private String englischeswort;
    private static int anzahlVokabeln;

    public Vokabel(String deutscheswort, String englischeswort) {
        this.deutscheswort = deutscheswort;
        this.englischeswort = englischeswort;

        anzahlVokabeln++;
    }

    public Vokabel() {
        anzahlVokabeln++;
    }

    public String getDeutscheswort() {
        return deutscheswort;
    }

    public void setDeutscheswort(String deutscheswort) {
        this.deutscheswort = deutscheswort;
    }

    public String getEnglischeswort() {
        return englischeswort;
    }

    public void setEnglischeswort(String englischeswort) {
        this.englischeswort = englischeswort;
    }

    public static int getAnzahlVokabeln() {
        return anzahlVokabeln;
        //Diese Methode kann man direkt über den Klassen-Namen aufrufen
    }
}
