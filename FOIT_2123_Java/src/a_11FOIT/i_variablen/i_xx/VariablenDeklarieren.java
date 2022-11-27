package a_11FOIT.i_variablen.i_xx;

public class VariablenDeklarieren {
    public static void main(String[] args) {
        int anzahl_kiste1 = 200;
        int anzahl_kiste2 = 400;
        int summe_kisten;
        summe_kisten = anzahl_kiste1 + anzahl_kiste2;
        System.out.println("Orangen in den Kisten: " + summe_kisten + "\n");

        String player_name = "Link";
        System.out.println("Spielername: " + player_name + "\n");

        String bevoelkerung_deutschland = "83.13 Millionen";
        System.out.println("Bevölkerung in Deutschland: " + bevoelkerung_deutschland + "\n");

        boolean isDay = true;
        System.out.print("Ist es Tag oder Nacht: ");
        if (isDay = true) {
            System.out.println("Es ist Tag \n");
        }
        else {
            System.out.println("Es ist Nacht \n");
        }

        String trefferquote_fußball = "78 %";
        System.out.println("Trefferquote: " + trefferquote_fußball + "\n");

        String jahre_schule_haupt = "9 Jahre";
        String jahre_schule_real = "10 Jahre";
        String jahre_schule_gym = "13 Jahre";
        String jahre_schule_fos = "12 Jahre";
        System.out.println("Jahre bis zum Abschluss \n" +
                "\tHauptschule: " + jahre_schule_haupt + "\n" +
                "\tRealschule: " + jahre_schule_real + "\n" +
                "\tGymnasium: " + jahre_schule_gym + "\n" +
                "\tFOS: " + jahre_schule_fos + "\n");

        int schüler_schule = 539;
        System.out.println("Schüler an der Schule: " + schüler_schule + " Schüler \n");

        String artikel_preis = "15,99€";
        System.out.println("Preis eines USB Sticks (16GB): " + artikel_preis + "\n");


    }
}