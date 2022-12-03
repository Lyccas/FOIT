package b_12FOIT.iv.schueler.fall_3;

public class Fall3Main {
    public static void main(String[] args) {
        Klasse3 klasse = new Klasse3("12FOIT", 104);

        Schueler3 schueler = new Schueler3("Anna", "Baum", 18, klasse);
        Schueler3 schueler1 = new Schueler3("Nico", "Busch", 19, klasse);
        Schueler3 schueler2 = new Schueler3("Henri", "Obertür", 17, klasse);
        Schueler3 schueler3 = new Schueler3("Abdual", "Alrasi", 20, klasse);
        Schueler3 schueler4 = new Schueler3("Cedric", "Diehl", 21, klasse);

        klasse.schuelerHinzufuegen(schueler);
        klasse.schuelerHinzufuegen(schueler1);
        klasse.schuelerHinzufuegen(schueler2);
        klasse.schuelerHinzufuegen(schueler3);
        klasse.schuelerHinzufuegen(schueler4);

        for (Schueler3 xxx:
                klasse.getSchueler3ArrayList()) {
            System.out.println(xxx + "\n");
        }

        System.out.println("*".repeat(30) + "\n");

        System.out.println(schueler);
        System.out.println("");
        System.out.println(schueler1);
        System.out.println("");
        System.out.println(schueler2);
        System.out.println("");
        System.out.println(schueler3);
        System.out.println("");
        System.out.println(schueler4);
    }
}
