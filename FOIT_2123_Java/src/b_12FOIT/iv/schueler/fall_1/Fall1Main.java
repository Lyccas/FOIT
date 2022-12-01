package b_12FOIT.iv.schueler.fall_1;

public class Fall1Main {
    public static void main(String[] args) {
        Klasse1 klasse = new Klasse1("12FOIT", 104);

        Schueler1 schueler = new Schueler1("Klaus", "Meier", 18, klasse);
        Schueler1 schueler1 = new Schueler1("Linda", "Lindt", 19, klasse);

        System.out.println(schueler);
        System.out.println("*".repeat(30));
        System.out.println(schueler1);
    }
}
