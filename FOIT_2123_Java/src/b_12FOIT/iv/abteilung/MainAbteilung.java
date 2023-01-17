package b_12FOIT.iv.abteilung;

public class MainAbteilung {
    public static void main(String[] args) {
        Mitarbeiter moellerMia = new Mitarbeiter("Möller", "Mia", 4643.45, 30, false);
        Mitarbeiter joergJung = new Mitarbeiter("Jung", "Jörg", 6500.56, 48, true);
        Mitarbeiter krausThomas = new Mitarbeiter("Kraus", "Thomas", 3667.45, 32, false);
        Mitarbeiter alsasGabi = new Mitarbeiter("Alsas", "Gabi", 7478.84, 58, true);
        Mitarbeiter bockerBob = new Mitarbeiter("Bocker", "Bob", 3878.56, 25, false);
        Mitarbeiter wackerAndreas = new Mitarbeiter("Wacker", "Andreas", 7650.78, 36, true);

        Abteilung verkauf = new Abteilung("Verkauf");
        Abteilung einkauf = new Abteilung("Einkauf");
        Abteilung personal = new Abteilung("Personal");

        verkauf.addMitarbeiter(moellerMia);
        verkauf.addMitarbeiter(alsasGabi);

        einkauf.addMitarbeiter(joergJung);
        einkauf.addMitarbeiter(krausThomas);
        einkauf.addMitarbeiter(bockerBob);

        personal.addMitarbeiter(wackerAndreas);

        System.out.println("VERKAUF:");
        System.out.println("#".repeat(25));
        System.out.println(verkauf.gesamtesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.durchschnittlichesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.geringstesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.durchschnittlichesAlter());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.aeltesterMitarbeiter());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.mitarbeiterMehrAls4000());
        System.out.println("*".repeat(50));
        System.out.println(verkauf.mitarbeiterMehrAlsDouble(3500.00));
        System.out.println("*".repeat(50));
        System.out.println(verkauf.zeigeAbteilunsleiter());

        System.out.println("-".repeat(100));

        System.out.println("EINKAUF:");
        System.out.println("#".repeat(25));
        System.out.println(einkauf.gesamtesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.durchschnittlichesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.geringstesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.durchschnittlichesAlter());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.aeltesterMitarbeiter());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.mitarbeiterMehrAls4000());
        System.out.println("*".repeat(50));
        System.out.println(einkauf.mitarbeiterMehrAlsDouble(3500.00));
        System.out.println("*".repeat(50));
        System.out.println(einkauf.zeigeAbteilunsleiter());

        System.out.println("-".repeat(100));

        System.out.println("PERSONAL:");
        System.out.println("#".repeat(25));
        System.out.println(personal.gesamtesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(personal.durchschnittlichesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(personal.geringstesGehalt());
        System.out.println("*".repeat(50));
        System.out.println(personal.durchschnittlichesAlter());
        System.out.println("*".repeat(50));
        System.out.println(personal.aeltesterMitarbeiter());
        System.out.println("*".repeat(50));
        System.out.println(personal.mitarbeiterMehrAls4000());
        System.out.println("*".repeat(50));
        System.out.println(personal.mitarbeiterMehrAlsDouble(3500.00));
        System.out.println("*".repeat(50));
        System.out.println(personal.zeigeAbteilunsleiter());
    }
}
