package b_12FOIT.x_klassenarbeit.filialeMitarbeiter;

public class Main {
    public static void main(String[] args) {
        Filiale filiale = new Filiale();

        filiale.setName("SuperQualitätsmarkt");
        filiale.erstellenUndHinzufuegenMitarbeiter("Muster", "Max", "männlich", 3500, true);
        filiale.erstellenUndHinzufuegenMitarbeiter("Gustav", "karla", "weiblich", 2900, false);
        filiale.erstellenUndHinzufuegenMitarbeiter("Klug", "Getrud", "divers", 3380, true);
        filiale.erstellenUndHinzufuegenMitarbeiter("Arens", "Paula", "weiblich", 3650, true);

        System.out.println(filiale.zeigeAvgGehalt());
        System.out.println("*".repeat(100));
        System.out.println(filiale.zeigeBestbezahltestenMitarbeiter());
        System.out.println("*".repeat(100));
        System.out.println(filiale.zeigeAlleAL());
        System.out.println("*".repeat(100));
        System.out.println(filiale.zeigeMitarbeiterinnen(3000));

        System.out.println("-".repeat(100));

        System.out.println(Mitarbeiter.getAnzahlMitarbeiter());
    }
}
