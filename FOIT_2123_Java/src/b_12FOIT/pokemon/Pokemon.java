package b_12FOIT.pokemon;

public class Pokemon {
    private String name; //Instanzvariablen
    private String geschlecht;
    private int level; //Standatzmäßig haben alle zunächst das Level 1
    private int nummer;
    private boolean gefangen; //Standartmäßig sind zunächst alle Pokemons nicht gefangen
    private double groesse; //in m
    //...

    //leerer Konstruktor --> dieser ist zunächst automatisch/unsichtbar vorhanden
    public Pokemon(){

    }

    public Pokemon(String name, String geschlecht, int level, int nummer, boolean gefangen, double groesse) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.level = level;
        this.nummer = nummer;
        this.gefangen = gefangen;
        this.groesse = groesse;
    }

    public Pokemon(String name, String geschlecht, int nummer, double groesse) {
        this.name = name;
        this.geschlecht = geschlecht;
        level = 1;
        this.nummer = nummer;
        gefangen = false;
        this.groesse = groesse;
    }

    public void setName(String name) {
        //if ... Fehlerprüfungen wären hier möglich
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public void setGefangen(boolean gefangen) {
        this.gefangen = gefangen;
    }

    public boolean getGefangen() {
        return gefangen;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public double getGroesse() {
        return groesse;
    }
}
