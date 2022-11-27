package b_12FOIT.zu1BeziehungKundeAdresse;

public class Adresse {
    private String str;
    private String nr;
    private int plz;
    private String ort;

    public Adresse(String str, String nr, int plz, String ort) {
        this.str = str;
        this.nr = nr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStr() {
        return str;
    }

    public String getNr() {
        return nr;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }
}
