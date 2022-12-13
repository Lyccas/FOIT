package b_12FOIT.x_zu1BeziehungKundeAdresse;

public class MainKundenprojekt {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("Hauptstraße", "5", 12345, "Musterdorf");

        Kunde kunde1 = new Kunde("Mustermann", "Max", adresse1);

        //Hier ein Überblick über unsere Kundendaten
        System.out.print(kunde1.getVorname() + " ");
        System.out.println(kunde1.getName());
        System.out.println("-".repeat(30));
        System.out.print(kunde1.getAdresse().getStr() + " ");
        System.out.print(kunde1.getAdresse().getNr() + ", ");
        System.out.print(kunde1.getAdresse().getPlz()+ ", ");
        System.out.println(kunde1.getAdresse().getOrt());

        System.out.println(kunde1.toString());
    }
}
