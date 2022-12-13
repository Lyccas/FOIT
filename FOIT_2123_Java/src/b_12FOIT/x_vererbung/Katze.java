package b_12FOIT.x_vererbung;

public class Katze extends Tier {
    private int anzahlVerspeisterMaeuse;
    private int boshaftigkeitslevel; //Level zwischen 1 & 10 (=sehr schlimm)

    public Katze(int alter, String geschlecht, int boshaftigkeitslevel) {
        super(alter, geschlecht);
        this.boshaftigkeitslevel = boshaftigkeitslevel;
        anzahlVerspeisterMaeuse = 0;
    }

    public int getAnzahlVerspeisterMaeuse() {
        return anzahlVerspeisterMaeuse;
    }

    public int getBoshaftigkeitslevel() {
        return boshaftigkeitslevel;
    }

    public void setBoshaftigkeitslevel(int boshaftigkeitslevel) {
        this.boshaftigkeitslevel = boshaftigkeitslevel;
    }

    public void essen() {
        anzahlVerspeisterMaeuse++;
    }

    public String geraeucheMachen() {
        return super.geraeucheMachen() + "Miau, miau";
    }

    public String warnungsmeldung() {
        if (boshaftigkeitslevel == 10) {
            return "Erhebliche Gefahr droht!!!";
        } else if (boshaftigkeitslevel >= 5) {
            return "Etwas Gefahr droht!";
        } else {
            return "Schmusekatze";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Anzahl Verspeister Mäuse = " + anzahlVerspeisterMaeuse + ", Boshaftigkeitslevel = " + boshaftigkeitslevel;
    }
}
