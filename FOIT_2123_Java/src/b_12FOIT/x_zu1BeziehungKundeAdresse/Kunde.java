package b_12FOIT.x_zu1BeziehungKundeAdresse;

public class Kunde {
    private String name;
    private String vorname;
    //Kunden seine Adresse zu weisen
    //komplexer Datentyp --> Objekt / Instanz
    private Adresse adresse; //der Kunde erhält seine eine Adresse

    public Kunde(String name, String vorname, Adresse adresse) {
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return vorname + " " + name + "\n" +
                getAdresse().getStr() + " " + getAdresse().getNr() + "\n" +
                getAdresse().getPlz() + ", " + getAdresse().getOrt();
    }
}
