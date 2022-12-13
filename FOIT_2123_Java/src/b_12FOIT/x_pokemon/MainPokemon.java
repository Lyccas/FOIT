package b_12FOIT.x_pokemon;

public class MainPokemon {
    public static void main(String[] args) {

        //Erzeugen eines Pokemon Objektes
        //mithilfe eines Konstruktor

        Pokemon pikachu = new Pokemon(); //keine Übergabe von Parametern d.h. Klammern sind leer
        //pikachu.name = "Pikatchu"; verstößt gegen das Geheimhaltungsprinzip der OOP
        pikachu.setName("Pikachu");
        pikachu.setGeschlecht("Männlich / Weiblich");
        pikachu.setLevel(5);
        pikachu.setNummer(25);
        pikachu.setGefangen(true);
        pikachu.setGroesse(0.4);

        System.out.println("-------------------------------------");
        System.out.println(pikachu.getName() + " #" + pikachu.getNummer());
        System.out.println("Geschlecht: " + pikachu.getGeschlecht());
        System.out.println("Level: " + pikachu.getLevel());
        System.out.println("Gefangen? " + pikachu.getGefangen());
        System.out.println("Größe: " + pikachu.getGroesse() + "m");

        Pokemon schillok = new Pokemon();
        schillok.setName("Schillok");
        schillok.setGeschlecht("Männlich / Weiblich");
        schillok.setLevel(25);
        schillok.setNummer(8);
        schillok.setGefangen(true);
        schillok.setGroesse(1);

        System.out.println("-------------------------------------");
        System.out.println(schillok.getName() + " #" + schillok.getNummer());
        System.out.println("Geschlecht: " + schillok.getGeschlecht());
        System.out.println("Level: " + schillok.getLevel());
        System.out.println("Gefangen? " + schillok.getGefangen());
        System.out.println("Größe: " + schillok.getGroesse() + "m");

        Pokemon rayquaza = new Pokemon();
        rayquaza.setName("Rayquaza");
        rayquaza.setGeschlecht("Undefiniert");
        rayquaza.setLevel(12);
        rayquaza.setNummer(384);
        rayquaza.setGefangen(false);
        rayquaza.setGroesse(7);

        System.out.println("-------------------------------------");
        System.out.println(rayquaza.getName() + " #" + rayquaza.getNummer());
        System.out.println("Geschlecht: " + rayquaza.getGeschlecht());
        System.out.println("Level: " + rayquaza.getLevel());
        System.out.println("Gefangen? " + rayquaza.getGefangen());
        System.out.println("Größe: " + rayquaza.getGroesse() + "m");

        Pokemon panflam = new Pokemon("Panflam", "Männlich / Weiblich", 4, 390, true, 0.5);
        System.out.println("-------------------------------------");
        System.out.println(panflam.getName() + " #" + panflam.getNummer());
        System.out.println("Geschlecht: " + panflam.getGeschlecht());
        System.out.println("Level: " + panflam.getLevel());
        System.out.println("Gefangen? " + panflam.getGefangen());
        System.out.println("Größe: " + panflam.getGroesse() + "m");

        Pokemon mew = new Pokemon("Mew", "Undefiniert", 151, 0.4);
        System.out.println("-------------------------------------");
        System.out.println(mew.getName() + " #" + mew.getNummer());
        System.out.println("Geschlecht: " + mew.getGeschlecht());
        System.out.println("Level: " + mew.getLevel());
        System.out.println("Gefangen? " + mew.getGefangen());
        System.out.println("Größe: " + mew.getGroesse() + "m");
    }
}
