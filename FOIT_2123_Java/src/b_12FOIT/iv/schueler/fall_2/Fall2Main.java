package b_12FOIT.iv.schueler.fall_2;

public class Fall2Main {
    public static void main(String[] args) {
        Klasse2 klasse = new Klasse2("12FOIT", 104);

        Schueler2 schueler = new Schueler2("Anna", "Baum", 18);
        Schueler2 schueler1 = new Schueler2("Nico", "Busch", 19);
        Schueler2 schueler2 = new Schueler2("Henri", "Obertür", 17);
        Schueler2 schueler3 = new Schueler2("Abdual", "Alrasi", 20);
        Schueler2 schueler4 = new Schueler2("Cedric", "Diehl", 21);

        klasse.schuelerHinzufuegen(schueler);
        klasse.schuelerHinzufuegen(schueler1);
        klasse.schuelerHinzufuegen(schueler2);
        klasse.schuelerHinzufuegen(schueler3);
        klasse.schuelerHinzufuegen(schueler4);

        for (Schueler2 xxx:
             klasse.getSchueler2ArrayList()) {
            System.out.println(xxx + "\n");
        }

        System.out.println("*".repeat(50) + "\n");

        for (int i = 0; i < klasse.getSchueler2ArrayList().size(); i++) {
            System.out.println(klasse.getSchueler(i) + "\n");
        }
    }
}
